package src.polymorphism;

public class Main {
    
    public static void main(String[] args)
    {
        car car = new car("Base", 4);
        car.startEngine();
        car.accelerate();
        car.brake();

        car maxima = new nissan("Maxima", 6);
        maxima.startEngine();
        maxima.accelerate();
        maxima.brake();
    }
}

class car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public car(String name, int cylinders)
    {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine()
    {
        System.out.println("Car -> Started Engine");
    }

    public void accelerate()
    {
        System.out.println("Car -> Accelerating");
    }

    public void brake()
    {
        System.out.println("Car -> Braking");
    }

    public boolean getEngine() {
        return this.engine;
    }

    public boolean isEngine() {
        return this.engine;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

}

class nissan extends car {

    public nissan(String name, int cylinders)
    {
        super(name, cylinders);
    }

    @Override
    public void accelerate()
    {
        System.out.println("Nissan -> Accelerating");
    }

    @Override
    public void startEngine()
    {
        System.out.println("Nissan -> Started Engine");
    }

    @Override
    public void brake()
    {
        System.out.println("Nissan -> Braking");
    }
}