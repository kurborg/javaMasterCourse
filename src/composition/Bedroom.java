package src.composition;

public class Bedroom {
    private String name;
    private Ceiling ceiling;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;
    private Bed bed;

    public Bedroom(String name, Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Bed bed) {
        this.name = name;
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ceiling getCeiling() {
        return this.ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Wall getWall1() {
        return this.wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return this.wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall3() {
        return this.wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall4() {
        return this.wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Bed getBed() {
        return this.bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public void makeBed()
    {
        System.out.println("Making bed");
        this.bed.make();
    }

}
