package src.composition;

public class Room {
    private String name;
    private int squareFt;

    public Room(String name, int squareFt) {
        this.name = name;
        this.squareFt = squareFt;
    }

    public void setSquareFt(int sqFt)
    {
        this.squareFt = sqFt;
    }
}
