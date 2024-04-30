package sb.lb.model.types;

import sb.lb.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }
}
