package src.Inheritance;

public class Vehicle {
    
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at  " + currentDirection + " Degrees");
    }

    public void stop()
    {
        this.currentVelocity = 0;
    }

    public void move(int velocity, int direction)
    {
        this.currentVelocity = velocity;
        this.currentDirection = direction;

        System.out.println("Vehicle.move(): Going " + currentVelocity + " in direction " + currentDirection);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

}
