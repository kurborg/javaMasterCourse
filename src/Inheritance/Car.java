package src.Inheritance;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    @Override
    public void stop()
    {
        super.stop();
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return this.gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Changed to " + currentGear);
    }

    public boolean isIsManual() {
        return this.isManual;
    }

    public boolean getIsManual() {
        return this.isManual;
    }

    public void setIsManual(boolean isManual) {
        this.isManual = isManual;
    }

}
