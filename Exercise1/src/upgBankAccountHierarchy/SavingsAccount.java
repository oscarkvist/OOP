package upgBankAccountHierarchy;

public class SavingsAccount extends BankAccountBase{

    public SavingsAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber,accountHolderName,balance);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    public void applyInterest() {
        double intrestRate = 0.05;
            double interest = getBalance() * intrestRate;
            setBalance(interest, true);
            System.out.println("Interest applied: " + interest + " SEK");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
