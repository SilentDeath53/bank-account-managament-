import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Account holder name: ");
        account.setAccountHolder(scanner.nextLine());
        System.out.print("Account number: ");
        account.setAccountNumber(scanner.nextLine());

        boolean continueExecution = true;
        while (continueExecution) {
            System.out.println("\n--- Bank Account Management ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    continueExecution = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Program exited.");
    }
}
