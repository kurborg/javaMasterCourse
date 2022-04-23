package src.composition;

public class Main {

    public static void main(String[] args)
    {
        Room room = new Room(null, 0);
        House house = new House(room);
        house.getRoom().setSquareFt(1500);

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("South");

        Lamp lamp = new Lamp("Modern", true, 55);
        Ceiling ceiling = new Ceiling(0, 0);
        Bed bed = new Bed("Modern", 3, 1, 2, 2);

        Bedroom bedroom = new Bedroom("Kurt's Room", ceiling, wall1, wall2, wall3, wall4, lamp, bed);

        bedroom.getLamp().turnOn();
        bedroom.makeBed();

    }
}
