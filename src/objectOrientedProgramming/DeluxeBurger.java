package src.OOP_Master_Challenge;

public class DeluxeBurger extends Hamburger{
    
    public DeluxeBurger()
    {
        super("Brown rye", "Bacon and Sausage", 12.00, "Deluxe Burger");
        super.addAddition1("Chips", 2);
        super.addAddition2("Drink", 1.50);
    }

    @Override
    public void addAddition1(String name, double price)
    {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void addAddition2(String name, double price)
    {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void addAddition3(String name, double price)
    {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void addAddition4(String name, double price)
    {
        System.out.println("Cannot add additional item.");
    }
}
