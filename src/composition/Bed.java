package src.composition;

public class Bed {
    private String style;
    private int pillows;
    private int quilt;
    private int height;
    private int sheets;

    public Bed(String style, int pillows, int quilt, int height, int sheets) {
        this.style = style;
        this.pillows = pillows;
        this.quilt = quilt;
        this.height = height;
        this.sheets = sheets;
    }


    public void make()
    {
        System.out.println("Bed being made");
    }


    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPillows() {
        return this.pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public int getQuilt() {
        return this.quilt;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }


}

