package sb.lb.util;

import sb.lb.dto.ContactDto;
import sb.lb.entity.ContactEntity;

public class Mapper {
    public static ContactDto entityToDto(ContactEntity entity) {
        ContactDto contactDto = new ContactDto();

        contactDto.setContactId(entity.getContactId());
        contactDto.setEmail(entity.getEmail());
        contactDto.setContactName(entity.getContactName());
        contactDto.setUserId(entity.getUserId());
        contactDto.setUserName(entity.getUserName());

        return contactDto;
    }
}
