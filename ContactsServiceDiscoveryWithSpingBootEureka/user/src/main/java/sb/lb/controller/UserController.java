package sb.lb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sb.lb.model.Contact;
import sb.lb.model.User;
import sb.lb.model.types.ContactList;
import sb.lb.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId) {
        User user = userService.getUser(userId);
        List<Contact> retrievedContacts = null;
        if (null != user) {
            ContactList contactList = restTemplate.getForObject("http://contact-service/contact/user/" + userId, ContactList.class);
            if (null == contactList) retrievedContacts = new ArrayList<>();
            user.setContacts(retrievedContacts);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
