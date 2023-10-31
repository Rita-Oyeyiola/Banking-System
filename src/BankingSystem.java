import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {

    private static ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void createAccount(Account account){
        accounts.add(account);
    }

    public void updateBalance(int accountNumber, double amount){
        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Balance updated successfully");
                return;
            }
        }
        System.out.println("Account not found. Transaction failed.");
    }

    public void addTransaction(int accountNumber, double amount, String transactionType, String description) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber){
                Transaction transaction =new Transaction();
                transactions.add(transaction);
                account.setBalance(account.getBalance() + amount);
                System.out.println("Transaction added successfully!");
                return;
            }
        }
        System.out.println("Account not found.Transaction failed");
    }

    private String getCurrentDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return currentDate.format(formatter);
    }

    public void transaction(Transaction transaction){
        transactions.add(transaction);
    }

    public ArrayList<Transaction> getTransactionHistory(int accountNumber){
        ArrayList<Transaction> transactionHistory = new ArrayList<>();
        for(Transaction transaction : transactions) {
            if (transaction.getAccountNumber() == accountNumber){
                transactionHistory.add(transaction);

            }
        }return transactionHistory;
    }

    public static void listAllAccount(){
        for (Account account : accounts){
            System.out.println("Account Name:" + account.getCustomerName());
            System.out.println("Account Number" + account.getAccountNumber());
            System.out.println("Account Balance" + account.getBalance());
            System.out.println("Account Type" + account.getAccountType());
        }
    }

    public void manageCustomerInfo(Customer customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Managing customer information:");
        System.out.println("1. Update Name");
        System.out.println("2. Update contact information");
        System.out.println("3. Update customer ID");
        System.out.println("4. Go Back");

        System.out.println("Enter your choice:");
        int customerChoice = scanner.nextInt();
        scanner.nextLine();

        switch (customerChoice) {
            case 1:
                System.out.println("Enter new name");
                String newName = scanner.nextLine();
                customer.setName(newName);
                System.out.println("Name updated successfully!");
                break;
            case 2:
                System.out.println("Enter new contact information");
                String newContactInfo = scanner.nextLine();
                customer.setName(newContactInfo);
                System.out.println("Contact info updated successfully!");
                break;
            case 3:
                System.out.println("Enter new customer ID");
                String newCustomerID = scanner.nextLine();
                customer.setName(newCustomerID);
                System.out.println("Name updated successfully!");
                break;
            case 4:
                System.out.println("Going back to the main menu");
                break;
            default:
                System.out.println("Invalid choice. Please try again");
                break;
        }
    }
        public void manageCustomerInfo(String customerID){

        }



}
