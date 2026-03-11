
public class Main {
    public static void main(String[] args) {
        FinanceManager financeManager = new FinanceManager();

        long hitenAccountNumber = financeManager.createAccount("Hiten Nath", 5000.00);

        financeManager.earn(hitenAccountNumber, 2000.00, "Interest earned" );

        financeManager.spend(hitenAccountNumber, 400.00, "Netflix Subscription");

        financeManager.viewBalance(hitenAccountNumber);

        financeManager.viewTransactionList(hitenAccountNumber);

    }
}