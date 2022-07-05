package MobilePhone;

import java.util.Scanner;

public class main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("6183030063");

    public static void main(String[] args)
    {
        boolean quit = false;
       int choice = 0;

       printInstructions();

       while(!quit)
       {
           System.out.println("\nEnter your choice: ");
           choice = scanner.nextInt();
           scanner.nextLine();

           switch(choice) 
           {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3: 
                    editContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quit = true;
                    break;
           }
       }
    }

    private static void printInstructions(){
        System.out.println("\n Choices: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of contacts");
        System.out.println("\t 2 - To Add a contact");
        System.out.println("\t 3 - To modify a contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To quit the application");
    }

    private static void printContacts(){
        mobilePhone.printContactList();
    }

    private static void addContact(){
        System.out.println("Enter Contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        mobilePhone.addNewContact(contact);
    }

    private static void editContact(){
        System.out.println("Enter Contact name: ");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.findContactByName(name);

        System.out.println("Enter new Phone Number: ");
        String newNumber = scanner.nextLine();

        mobilePhone.updateExistingContact(oldContact, newNumber);
    }

    private static void removeContact(){
        System.out.println("Enter Contact name: ");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.findContactByName(name);

        mobilePhone.removeContact(contact);
    }
}
