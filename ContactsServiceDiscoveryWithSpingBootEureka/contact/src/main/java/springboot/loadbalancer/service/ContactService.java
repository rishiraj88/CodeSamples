package springboot.loadbalancer.service;

import springboot.loadbalancer.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
