package GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class GroceryList {
    
    private ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] Args)
     {

        GroceryList groceryList = new GroceryList();
        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("Eggs");
        groceryList.addGroceryItem("Bacon");
        groceryList.addGroceryItem("Chicken");
        groceryList.addGroceryItem("Steak");
        groceryList.addGroceryItem("Yogurt");
        groceryList.addGroceryItem("Paper Towels");
        groceryList.addGroceryItem("Toilet Paper");

        groceryList.printGroceryList();

        groceryList.modifyGroceryList("Bacon", "Turkey Bacon");

        groceryList.removeGroceryListItem("Toilet Paper");

        groceryList.findItem("Steak");
        groceryList.findItem("Toilet Paper");
    }

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
        System.out.println("Added Item: "+ item+ " at index " + groceryList.size());
    }

    public void printGroceryList()
    {
        System.out.println("\nGrocery List size of " + groceryList.size() + ":");

        int index = 1;

        for(String item:groceryList)
        {
           System.out.println(index++ + ": " + item);
        }
    }

    public void modifyGroceryList(String oldItem, String newItem)
    {
        System.out.println("\nGrocery Item: " + oldItem + " being modified to " + newItem);
        int index = groceryList.indexOf(oldItem);
        if(index >= 0)
            groceryList.set(index, newItem);
        else
            System.out.println("\n" + oldItem + " does not exist to modify");
    }

    public void removeGroceryListItem(String item)
    {
        

        int index = groceryList.indexOf(item);
        if(index >= 0)
        {
            System.out.println("\nRemoving Item: " + item);
            groceryList.remove(item);
        }
        else
            System.out.println("\n" + item + " does not exist to remove");
    }

    public String findItem(String item)
    {
        int position = groceryList.indexOf(item);
        if(position >= 0)
        {
            System.out.println("\nItem: " + item +  " exists");
            return groceryList.get(position);
        }
        
        System.out.println("\nItem: " + item + " does not exist");
        return null;
    }
}
