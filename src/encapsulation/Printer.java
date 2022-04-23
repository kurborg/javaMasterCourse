package src.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex)
    {
        if(tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerAmount >= 100 || tonerAmount < 0)
            return -1;
        
        if(tonerAmount + this.tonerLevel > 100)
            return -1;

        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;

        if(this.duplex)
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
        
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted()
    {
        return this.pagesPrinted;
    }

}

