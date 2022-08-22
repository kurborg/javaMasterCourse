import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String name, double initialTransaction){

        if(findCustomer(name) == null){
            customers.add(new Customer(name, initialTransaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){

        Customer existingCustomer = findCustomer(name);

        if( existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name){
        for(Customer customer: customers){
            if(customer.getName().equals(name)){
                return customer;
            }
        }

        return null;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }
}
