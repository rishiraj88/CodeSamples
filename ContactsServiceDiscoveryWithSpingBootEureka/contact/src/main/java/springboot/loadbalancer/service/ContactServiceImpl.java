package springboot.loadbalancer.service;

import org.springframework.stereotype.Service;
import springboot.loadbalancer.entity.Contact;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = List.of(
      new Contact(1L, "rishiraj@web.com","Rishi Raj", 2021L),
            new Contact(1L, "maikelt@web.com","Maikel", 2022L),
            new Contact(1L, "alexm@web.com","Alex", 2024L),
            new Contact(1L, "sahilk@web.com", "Sahil", 2023L)
            );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return
                list.stream().filter(contact -> contact.getUserId().equals(userId))
                .collect(Collectors.toList())
                ;
    }
}
