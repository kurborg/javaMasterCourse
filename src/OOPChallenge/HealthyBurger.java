package src.OOP_Master_Challenge;

public class HealthyBurger extends Hamburger{
    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, double price)
    {
        super("Brown rye", meat, price, "Healthy Burger");
    }

    public void addHealthyAddition1(String name, double price)
    {
        System.out.println("Adding Healthy addition " + name + " with price " + price);
        healthyAddition1Name = name;
        healthyAddition1Price = price;
    }

    public void addHealthyAddition2(String name, double price)
    {
        System.out.println("Adding Healthy addition " + name + " with price " + price);
        healthyAddition2Name = name;
        healthyAddition2Price = price;
    }

    @Override
    public double getPrice()
    {
        double hamburgerPrice = super.getPrice();

        if(healthyAddition1Name != null)
        {
            hamburgerPrice += healthyAddition1Price;
        }

        if(healthyAddition2Name != null)
        {
            hamburgerPrice += healthyAddition2Price;
        }

        return hamburgerPrice;
    }
}
