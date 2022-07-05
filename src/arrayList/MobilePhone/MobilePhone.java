package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    
    private String myNumber;
    private ArrayList<Contact> contactList;

    public MobilePhone(String number){
        this.myNumber = number;
        this.contactList = new ArrayList<Contact>();
    }

    public void addNewContact(Contact contact){
        if(findContact(contact) != -1)
            System.out.println("\nContact already exists");
        else {
            contactList.add(contact);
            System.out.println("\nContact: " + contact.getName() + " added successfully");
        }
    }

    public void removeContact(Contact contact){
        if(findContact(contact) == -1)
            System.out.println("\nContact doesn't exist");
        else{
            contactList.remove(findContact(contact));
            System.out.println("\nContact: " + contact.getName() + " removed succesfully");
        }
    }

    public void updateContact(Contact oldContact, Contact newContact){
        int contactIndex = findContact(oldContact);
        if(contactIndex == -1)
            System.out.println("\nContact doesn't exist");
        else{
            contactList.set(contactIndex, newContact);
            System.out.println("\nContact: " + oldContact.getName() + ": " + oldContact.getPhoneNumber()+  "\nreplaced with: " + newContact.getName() + ": " + newContact.getPhoneNumber());
        }
    }

    public int findContact(String name){
        
        for(int i = 0; i < this.contactList.size(); i++)
        {
            if(this.contactList.get(i).getName().equals(name))
                return i;
        }

        return -1;
    }

    public int findContact(Contact contact){
        return this.contactList.indexOf(contact);
    }

    public Contact queryContact(String name){
        int position = findContact(name);

        if(position >= 0){
            return this.contactList.get(position);
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
