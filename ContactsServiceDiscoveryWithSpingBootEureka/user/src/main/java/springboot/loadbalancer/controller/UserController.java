package springboot.loadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springboot.loadbalancer.entity.Contact;
import springboot.loadbalancer.entity.User;
import springboot.loadbalancer.service.UserService;

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
        if (null != user) {
            List<Contact> contacts = restTemplate.getForObject("http://contact-service/contact/user/" + userId, List.class);
            user.setContacts(contacts);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
