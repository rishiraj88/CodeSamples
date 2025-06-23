package sb.lb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sb.lb.dto.ContactDto;
import sb.lb.dto.UserDto;
import sb.lb.dto.types.ContactList;
import sb.lb.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{userId}")
    public ResponseEntity<ContactList> getContactsForUser(@PathVariable("userId") Long userId) {
        List<ContactDto> contacts = contactService.getContactsOfUser(userId);
        if (null == contacts || contacts.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            UserDto user = restTemplate.getForObject("http://user-service/api/users/" + userId, UserDto.class);
            contacts.forEach(contact -> contact.setUserName(user.getName()));
            ContactList retrievedContacts = new ContactList();
            retrievedContacts.getContacts().addAll(contacts);
            return new ResponseEntity<ContactList>(retrievedContacts, HttpStatus.OK);
        }
    }
}
