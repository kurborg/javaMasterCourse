package src.composition;

public class House {
    private Room room;
    private int squareFt;

    House(Room room)
    {
        this.room = room;
    }

    public Room getRoom()
    {
        return this.room;
    }
}
