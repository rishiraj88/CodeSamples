package sb.lb.entity;


import sb.lb.dto.ContactDto;

import java.util.List;

public class UserEntity {
    private Long userId;
    private String name;
    private String phone;
    List<ContactDto> contacts = null;

    public UserEntity(Long userId, String name, String phone, List<ContactDto> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public UserEntity(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContacts(List<ContactDto> contacts) {
        this.contacts = contacts;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<ContactDto> getContacts() {
        return contacts;
    }
}
