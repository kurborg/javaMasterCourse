public class BankTest {
    
    public static void main(String[] args){

        Bank bank = new Bank("Chase Bank");
        bank.addBranch("Dallas");
        bank.addCustomer("Dallas", "Kurt", 49.50 );
        bank.addCustomer("Dallas", "Mike", 13.50);
        bank.addCustomer("Dallas", "Percy", 56.60);

        bank.addBranch("Austin");
        bank.addCustomer("Austin", "Erika", 15.00);

        bank.addCustomerTransaction("Dallas", "Kurt", 12.07);
        bank.addCustomerTransaction("Dallas", "Mike", 4.14);
        bank.addCustomerTransaction("Austin", "Erika", 17.56);

        bank.listCustomers("Dallas", true);
        bank.listCustomers("Austin", false);
    
    }
}
