package sb.lb.service;


import sb.lb.dto.ContactDto;

import java.util.List;

public interface ContactService {
    public List<ContactDto> getContactsOfUser(Long userId);
}
