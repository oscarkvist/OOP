package upgBank;

public class BankAccount {
    private final String accountNumber;
    private final String name;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    private double convertToSEK(double amount, String currency) {
        double SEK_TO_USD = 0.12;
        double SEK_TO_EURO = 0.10;
        return switch (currency) {
            case "SEK" -> amount;
            case "EURO" -> amount / SEK_TO_EURO;
            case "USD" -> amount / SEK_TO_USD;
            default -> {
                System.out.println("Unsupported  currency");
                yield 0.0;
            }
        };
    }

    public void deposit(int deposit, String currency) {
        balance += convertToSEK(deposit, currency);
    }

    public void withdraw(int withdraw, String currency) {
        if (withdraw > balance) {
            System.out.println("Not enough money on the account");
        } else {
            balance -= convertToSEK(withdraw,currency);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance:" + balance);
    }
}
