import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankingSystem bankingSystemClass = new BankingSystem();

        while (true) {
            System.out.println("Banking Account Management System");
            System.out.println("1.Create account");
            System.out.println("2.Update balance");
            System.out.println("3.Add transaction");
            System.out.println("4.Get transaction");
            System.out.println("5.List all accounts");
            System.out.println("6.Manage customer info");
            System.out.println("7. Exit");
            System.out.println("Enter your choice \n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Account account = new Account();
                    System.out.println("Please enter your account number \n");
                    Long accountNumber = scanner.nextLong();
                    account.setAccountNumber(accountNumber);

                    System.out.println("Please enter your account name \n");
                    String customerName = scanner.nextLine();
                    account.setCustomerName(customerName);

                    System.out.println("Please enter your balance \n");
                    double balance = scanner.nextDouble();
                    account.setBalance(balance);

                    System.out.println("Please enter your account type \n");
                    String accountType = scanner.nextLine();
                    account.setAccountType(accountType);

                    break;

                case 2:
                    Customer customer = new Customer();
                    System.out.println("Please enter your name");
                    String name = scanner.nextLine();
                    customer.setName(name);

                    System.out.println("Please enter your contact details");
                    String contact = scanner.nextLine();
                    customer.setContact(contact);

                    System.out.println("Please enter your customer ID");
                    int customerId = scanner.nextInt();
                    customer.setCustomerId(customerId);

                    break;

                case 3:
                    Transaction transaction = new Transaction();
                    System.out.println("Please enter your transaction Id");
                    String transactionId = scanner.nextLine();
                    transaction.setTransactionID(transactionId);

                    System.out.println("Please enter your today's date");
                    int date = scanner.nextInt();
                    transaction.setDate(date);

                    System.out.println("Please enter the amount");
                    int amount = scanner.nextInt();
                    transaction.setAmount(amount);

                    System.out.println("Please enter your transaction type");
                    String transactionType = scanner.nextLine();
                    transaction.setTransactionType(transactionType);

                    System.out.println("Please enter description");
                    String description = scanner.nextLine();
                    transaction.setDescription(description);

                    break;

                case 4:
                    BankingSystem.listAllAccount();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again");


            }

        }


    }
}