package sb.lb.service;

import org.springframework.stereotype.Service;
import sb.lb.entity.ContactEntity;
import sb.lb.model.Contact;
import sb.lb.util.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<ContactEntity> list = List.of(
      new ContactEntity(1L, "rishiraj@web.com","Rishi Raj", 2021L),
            new ContactEntity(1L, "maikelt@web.com","Maikel", 2022L),
            new ContactEntity(1L, "alexm@web.com","Alex", 2024L),
            new ContactEntity(1L, "sahilk@web.com", "Sahil", 2023L)
            );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        List<ContactEntity> contactEntities = list.stream().filter(contact -> contact.getUserId().equals(userId))
                .toList();
       return contactEntities.stream().map(Mapper::entityToModel).collect(Collectors.toList());
    }
}
