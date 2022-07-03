package src.OOP_Master_Challenge;

public class Hamburger
{
    private double price;
    private String name;
    private String rollType;
    private String meat;
    
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String rollType, String meat, double price, String name)
    {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        System.out.println(this.name + " price is: " + this.price);

        if(addition1Name != null)
        {
            this.price += addition1Price;
        }

        if(addition2Name != null)
        {
            this.price += addition2Price;
        }

        if(addition3Name != null)
        {
            this.price += addition3Price;
        }

        if(addition4Name != null)
        {
            this.price += addition4Price;
        }
        
        return this.price;
    }

    public void addAddition1(String name, double price)
    {
        System.out.println("Adding " + name + " with price " + price);
        addition1Name = name;
        addition1Price = price;
    }

    public void addAddition2(String name, double price)
    {
        System.out.println("Adding " + name + " with price " + price);
        addition2Name = name;
        addition2Price = price;
    }

    public void addAddition3(String name, double price)
    {
        System.out.println("Adding " + name + " with price " + price);
        addition3Name = name;
        addition3Price = price;
    }

    public void addAddition4(String name, double price)
    {
        System.out.println("Adding " + name + " with price " + price);
        addition4Name = name;
        addition4Price = price;
    }


}
