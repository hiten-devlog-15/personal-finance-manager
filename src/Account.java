import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {
    private String name;
    private double balance;
    private List<Transaction> transactionList= new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    Account(String name, double balance){
        this.name=name;
        this.balance=balance;
    }

    public List<Transaction> earn(double amount, String description){
        if(amount>0){
            balance = balance + amount;
            Transaction transaction = new Transaction("credit", amount, LocalDateTime.now(), description);
            transactionList.add(transaction);
            }
        else {
            throw new IllegalArgumentException("Invalid amount");
        }
        return Collections.unmodifiableList(transactionList);
    }

    public List<Transaction> spend(double amount, String description){
        if(amount > 0 && amount<=balance){
            balance = balance - amount;
            Transaction transaction = new Transaction("debit", amount, LocalDateTime.now(), description);
            transactionList.add(transaction);
        }
        else throw new IllegalArgumentException("Insufficient balance");
        return Collections.unmodifiableList(transactionList);
    }

    public void viewBalance(){
        System.out.println("Your balance is " + balance);
    }

    public void viewTransactionList(){
        for(Transaction t : transactionList){
            System.out.println(t.toString());
        }
    }

     public void viewDetails(){
         System.out.println("Name : " + name);
     }
}
