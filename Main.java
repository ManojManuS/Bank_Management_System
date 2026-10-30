import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1, "Rahul", "CREDIT", 10000),
            new Transaction(2, "Priya", "DEBIT", 3000),
            new Transaction(3, "Arun", "CREDIT", 7000),
            new Transaction(4, "Sneha", "DEBIT", 6000),
            new Transaction(5, "Kiran", "CREDIT", 15000),
            new Transaction(6, "John", "DEBIT", 2000)
        );

        BankingService service = new BankingService();

        System.out.println("All Transactions:");
        service.displayTransactions(transactions);

        System.out.println("\nCredit Transactions:");
        service.creditTransactions(transactions);

        System.out.println("\nDebit Transactions:");
        service.debitTransactions(transactions);

        System.out.println("\nTransactions Above 5000:");
        service.highValueTransactions(transactions);

        System.out.println("\nTotal Credit:");
        service.totalCredit(transactions);

        System.out.println("\nTotal Debit:");
        service.totalDebit(transactions);

        System.out.println("\nSorted Transactions:");
        service.sortTransactions(transactions);

        System.out.println("\nHighest Transaction:");
        service.highestTransaction(transactions);
    }
}
