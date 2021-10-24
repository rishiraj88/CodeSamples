package springboot.loadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.loadbalancer.entity.Contact;
import springboot.loadbalancer.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContactsForUser(@PathVariable("userId") Long userId) {
        return contactService.getContactsOfUser(userId);
    }
}
