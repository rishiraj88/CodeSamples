package sb.lb.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private Long userId;
    private String name;
    private String phone;

    List<ContactDto> contacts = new ArrayList<ContactDto>();

    public UserDto(Long userId, String name, String phone, List<ContactDto> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public UserDto(Long userId, String name, String phone) {
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

        return null == name?"":name;
    }

    public String getPhone() {
        return phone;
    }

    public List<ContactDto> getContacts() {
        return contacts;
    }
}
