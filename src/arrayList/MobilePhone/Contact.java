package MobilePhone;

public class Contact {
    
    private String name;
    private String phoneNumber;

    public Contact(String name, String number){
        this.name = name;
        this.phoneNumber = number;
    }

    public static Contact createContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
