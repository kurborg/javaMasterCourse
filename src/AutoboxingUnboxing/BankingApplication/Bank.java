import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);

        if(branch != null){
            return branch.addNewCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);

        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String name){
        for(Branch branch: branches){
            if(branch.getName().equals(name)){
                return branch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);

        if(branch != null){
            System.out.println("Customers for Branch " + branch.getName());
            
            ArrayList<Customer> customers = branch.getCustomers();

            for(Customer customer : customers){
                System.out.println("Customer name: " + customer.getName());
                if(showTransactions){
                    System.out.println("Transactions: ");
                    for(double amount : customer.getTransactions()){
                        System.out.println("Transaction amount: " + amount);
                    }
                }
            }

            return true;
        }
        else {
            return false;
        }
    }
}
