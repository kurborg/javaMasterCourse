package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    
    private String myNumber;
    private ArrayList<Contact> contactList;

    public MobilePhone(String number){
        this.myNumber = number;
        this.contactList = new ArrayList<Contact>();
    }

    public void addNewContact(Contact newContact){
        if(findContact(newContact.getName()) != null)
            System.out.println("Contact already exists");
        else
            contactList.add(newContact);
    }

    public void removeContact(Contact contact){
        if(findContact(contact.getName()) == null)
            System.out.println("Contact doesn't exist");
        else
            contactList.remove(contact);
    }

    public void updateExistingContact(Contact contact, String number){
        if(findContact(contact.getName()) == null)
            System.out.println("Contact doesn't exist");
        else{
            contactList.get(contactList.indexOf(contact)).setPhoneNumber(number);
        }
    }

    public Contact findContact(String name){
        
        for(int i = 0; i < contactList.size(); i++)
        {
            if(contactList.get(i).getName() == name)
                return contactList.get(i);
        }
        
        return null;
    }
    
    public void printContactList(){
        System.out.println("\nContact List size of " + contactList.size() + ":");

        for(Contact contact:contactList)
        {
           System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }
}
