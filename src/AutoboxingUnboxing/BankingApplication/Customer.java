import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    Customer(String name, double initialTransaction){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }
}
