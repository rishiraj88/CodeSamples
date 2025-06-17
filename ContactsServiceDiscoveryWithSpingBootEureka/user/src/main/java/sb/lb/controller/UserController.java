package sb.lb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sb.lb.dto.ContactDto;
import sb.lb.dto.UserDto;
import sb.lb.dto.types.ContactList;
import sb.lb.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable("userId") Long userId) {
        UserDto user = userService.getUser(userId);
        List<ContactDto> retrievedContacts = null;
        if (null != user) {
            ContactList contactList = restTemplate.getForObject("http://contact-service/api/contacts/user/" + userId, ContactList.class);
            if (null == contactList) retrievedContacts = new ArrayList<>();
            user.setContacts(retrievedContacts);
            return new ResponseEntity<UserDto>(user, HttpStatus.OK);
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
