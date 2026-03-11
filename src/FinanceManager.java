import java.util.HashMap;
import java.util.Map;

public class FinanceManager {
    private Map<Long, Account> accountHashMap = new HashMap<Long, Account>();
    private long accountNumberCounter = 1000L;

    public long createAccount(String name, double balance){
        if((name != null && !name.trim().isEmpty()) && balance >= 0){
            Account account = new Account( name, balance);
            accountHashMap.put(accountNumberCounter, account);
            long accountNumber = accountNumberCounter;
            accountNumberCounter++;
            return accountNumber;
        }
        else throw new IllegalArgumentException("Invalid name or insufficient balance");
    }

    public void spend(long accountNumber, double amount, String description){
        if(accountHashMap.get(accountNumber) != null){
            Account account = accountHashMap.get(accountNumber);
            account.spend(amount, description);
        }
        else throw new IllegalArgumentException("Invalid accountNumber");
    }

    public void earn(long accountNumber, double amount, String description){
        if(accountHashMap.get(accountNumber) != null){
            Account account = accountHashMap.get(accountNumber);
            account.earn(amount, description);
        }
        else throw new IllegalArgumentException("Invalid accountNumber");
    }

    public void viewBalance(long accountNumber){
        if (accountHashMap.get(accountNumber) != null) {
            Account account = accountHashMap.get(accountNumber);
            account.viewBalance();
        }
        else throw new IllegalArgumentException("Invalid Account number");
    }

    public void viewTransactionList(long accountNumber) {
        if (accountHashMap.get(accountNumber) != null) {
            Account account = accountHashMap.get(accountNumber);
            account.viewTransactionList();
        }
        else throw new IllegalArgumentException("Invalid Account number");
    }

    public void viewDetails(long accountNumber){
        if(accountHashMap.get(accountNumber) != null){
            Account account = accountHashMap.get(accountNumber);
            account.viewDetails();
        }
    }

}
