package src.arrayList;

import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    
    public static void main(String[] Args)
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
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
           }
       }
    }

    
    public static void printInstructions()
    {
        System.out.println("\n Choices: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of grocery items.");
        System.out.println("\t 2 - To Add an item to the list");
        System.out.println("\t 3 - To modify an item from the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem()
    {
        System.out.println("\nPlease enter the grocery item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.println("\nPlease enter the item to modify: ");
        String item = scanner.nextLine();
        System.out.println("\nPlease enter the replacement item : ");
        String replacementItem = scanner.nextLine();
        groceryList.modifyGroceryList(item, replacementItem);
    }

    public static void removeItem()
    {
        System.out.println("\nPlease enter the item to remove: ");
        groceryList.removeGroceryListItem(scanner.nextLine());
    }

    public static void searchForItem()
    {
        System.out.println("\nPlease enter the item number to search for: ");
        groceryList.findItem(scanner.nextLine());
    }
}
