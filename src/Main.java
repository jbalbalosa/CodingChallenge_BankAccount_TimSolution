public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account("123-456-789", 0.00,
                "Jeff", "@gmail", "778-2572");


        //Empty constructor
        Account secondAccount = new Account();


/*      No need for this because it was already defined above with constructor
        myAccount.setAccountNumber("123-456");
        myAccount.setAccountBalance(0.0);
        myAccount.setCustomerName("Jeff");
        myAccount.setCustomerEmailAddress("me@yahoo.com");
        myAccount.setCustomerPhoneNumber("+680-778-2572");*/


        myAccount.withdrawal(100.0);

        myAccount.deposit(50.0);
        myAccount.withdrawal(100.0);

        myAccount.deposit(51.0);
        myAccount.withdrawal(100.0);

        Account jeffAccount = new Account("Jeff", "jeffbalbalosa@gmail", "123456");
        System.out.println("Account Number: " + jeffAccount.getAccountNumber() + " Balance: " + jeffAccount.getAccountBalance() +
                " Account Number: " + jeffAccount.getCustomerName());
    }
}