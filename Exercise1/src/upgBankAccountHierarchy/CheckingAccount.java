package upgBankAccountHierarchy;

public class CheckingAccount extends BankAccountBase{
    public CheckingAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber,accountHolderName,balance);
    }


    @Override
    public void withdraw(double withdraw) {
        double overDrafLimit = -1000000.0;
        if(getBalance() - withdraw >= overDrafLimit){
            setBalance(withdraw,false);
        System.out.println("Withdrawn " + withdraw + " SEK");
    } else {
        System.out.println("Exceeds overdraft limit");
    }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
