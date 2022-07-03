package src.OOP_Master_Challenge;

import src.OOP_Master_Challenge.Hamburger;

public class main {
    public static void main(String[] args)
    {
        Hamburger hamburger = new Hamburger("White Bun", "Beef", 4.50, "Basic");
        hamburger.getPrice();

        Hamburger deluxeHamburger = new Hamburger("White Bun", "Beef", 4.50, "Basic");
        deluxeHamburger.addAddition1("Tomato", .75);
        deluxeHamburger.addAddition2("Mayo", .50);
        deluxeHamburger.addAddition3("Mustard", .15);
        deluxeHamburger.addAddition4("Pickle", 0.30);
        System.out.println("Total Burger price is: " + deluxeHamburger.getPrice()+ "\n");

        HealthyBurger healthyburger = new HealthyBurger("Bacon", 4.50);
        healthyburger.addAddition1("Tomato", .75);
        healthyburger.addAddition2("Mayo", .50);
        healthyburger.addHealthyAddition1("Lentils", .15);
        healthyburger.addHealthyAddition2("Lettuce", 0.30);
        System.out.println("Total Healthy Burger price is: " + healthyburger.getPrice() + "\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addAddition1("Can't do this", 80.23);
        System.out.println("Total Deluxe Burger price is: " + deluxeBurger.getPrice() + "\n");

    }
}
