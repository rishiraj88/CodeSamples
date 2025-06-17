package sb.lb.dto.types;


import sb.lb.dto.ContactDto;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<ContactDto> contacts = new ArrayList<>();

    public List<ContactDto> getContacts() {
        return contacts;
    }
}
