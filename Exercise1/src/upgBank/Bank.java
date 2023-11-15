package upgBank;

public class Bank {
    private BankAccount[] accounts;
    private int numAccounts;

    public Bank() {
        accounts = new BankAccount[1000];
        numAccounts = 0;
    }
public void creatNewAccount(String accountNumber, String accountHolderName){
        if (numAccounts < accounts.length){
            accounts[numAccounts] = new BankAccount(accountNumber,accountHolderName);
                    numAccounts++;
        }else {
            System.out.println("Max accounts reached");
        }
}
public void reportAllAccounts(){
    for (int i = 0; i < numAccounts; i++) {
        accounts[i].displayAccountInfo();

    }
}
public BankAccount getAccounts(String accountNumeber){
    for (int i = 0; i < numAccounts; i++) {
        if(accounts[i].getAccountNumber().equals(accountNumeber)){
            return accounts[i];
        }
    }
    return null;
    }
    public double getTotalBalance(){
        double totalBalance = 0;
        for (int i = 0; i < numAccounts; i++) {
            totalBalance += accounts[i].getBalance();
        }
        return totalBalance;
    }
}
