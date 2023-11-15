package upgBankAccountHierarchy;

public class BankAccountBase {
    private final String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccountBase(String accountNumber, String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance, boolean deposit) {
        if(deposit) {
            this.balance += balance;
        }else {
            this.balance -= balance;
        }
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        if (withdraw > balance) {
            System.out.println("Not enough money on the account");
        } else {
            balance -= withdraw;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance:" + balance);
    }
}
