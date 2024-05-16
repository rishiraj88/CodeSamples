package sb.lb.util;

import sb.lb.entity.ContactEntity;
import sb.lb.model.Contact;

public class Mapper {
    public static Contact entityToModel(ContactEntity entity) {
        Contact model = new Contact();

        model.setContactId(entity.getContactId());
        model.setEmail(entity.getEmail());
        model.setContactName(entity.getContactName());
        model.setUserId(entity.getUserId());
        model.setUserName(entity.getUserName());

        return model;
    }
}
