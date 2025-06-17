package sb.lb.dto;

public class ContactDto {
    private Long contactId;
    private String email;
    private String contactName;

    private Long userId;
    private String userName;

    public ContactDto(Long contactId, String email, String contactName, Long userId) {
        this.contactId = contactId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public ContactDto() {
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getContactId() {
        return contactId;
    }

    public String getEmail() {
        return email;
    }

    public String getContactName() {
        return contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
