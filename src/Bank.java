public class Bank {

    String Account_holder = "Anu";
    String Account_number1 = "1234asdf5678";
    String Account_number2 = "1234asdf5423";
    double balance = 5000;

    // Method to create an account and show details
    void create_account() {
        System.out.println("Hello! Your account has been created." + "\n" + "Available Balance: " + balance + "\t" + "Account holder name: " + Account_holder + "\t" + "Account Number: " + Account_number1 + "\n");
        System.out.println("Choose action: \n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Transfer Money\n");
    }

    // Method to check balance
    double check_balance() {
        System.out.println(balance);
        return balance;
    }

    // Method to deposit an amount
    double deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount of Rs." + amount + " is credited to your account successfully.\n" + "Available balance is Rs." + balance);
        return balance;
    }

    // Method to withdraw an amount
    double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Your amount is withdrawn successfully. \nAvailable Balance: " + balance);
            return balance;
        } else {
            System.out.println("Insufficient funds. Available balance is: "+ balance);
            return balance;
        }
    }

    // Method for transferring money
    double moneytransfer(double amount){
        double receiver_balance = 6000;
        if (balance >= amount) {
            receiver_balance = receiver_balance + amount;
            balance = balance - amount;
            System.out.println("Your amount of Rs." + amount + " is transferred successfully. \nTotal available balance in your account " + Account_number1 + " is Rs." + balance);
            System.out.println("Amount of Rs."+ amount + " is credited to account number-" +Account_number2 + ". Available balance is Rs." + receiver_balance);
            return balance;
        } else {
            System.out.println("Insufficient funds. Available balance is: "+ "Rs." + balance);
            return balance;
        }
    }

    public static void main (String[] args){
        Bank bank = new Bank();
        bank.create_account();

        int action = 4; // Set the action for testing
        if (action == 1) {
            bank.deposit(523.45);
        } else if (action == 2) {
            bank.withdraw(120.12);
        } else if (action == 3) {
            System.out.println("Available Balance: Rs.");
            bank.check_balance();
        } else if (action == 4){
            bank.moneytransfer(250.45);
        } else {
            System.out.println("Invalid action. Please try again.");
        }
    }
}
