public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Add getter and setter methods

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into the account.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
