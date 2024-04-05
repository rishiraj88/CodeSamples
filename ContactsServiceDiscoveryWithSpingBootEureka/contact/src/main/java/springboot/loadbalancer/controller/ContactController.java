package springboot.loadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springboot.loadbalancer.entity.Contact;
import springboot.loadbalancer.entity.User;
import springboot.loadbalancer.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{userId}")
    public ResponseEntity<List<Contact>> getContactsForUser(@PathVariable("userId") Long userId) {
        List<Contact> contacts = contactService.getContactsOfUser(userId);

        if (null == contacts || contacts.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        else {
            User user = restTemplate.getForObject("http://user-service/user/"+userId,User.class);
            contacts.forEach(contact -> contact.setUserName(user.getName()));
            return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
        }
    }
}
