import java.util.Comparator;
import java.util.List;

public class BankingService {

    public void displayTransactions(List<Transaction> list) {
        list.forEach(t -> System.out.println(
            t.getCustomerName() + " : " + t.getType() + " : " + t.getAmount()
        ));
    }

    public void creditTransactions(List<Transaction> list) {
        list.stream()
            .filter(t -> t.getType().equals("CREDIT"))
            .forEach(t -> System.out.println(t.getCustomerName() + " : " + t.getAmount()));
    }

    public void debitTransactions(List<Transaction> list) {
        list.stream()
            .filter(t -> t.getType().equals("DEBIT"))
            .forEach(t -> System.out.println(t.getCustomerName() + " : " + t.getAmount()));
    }

    public void highValueTransactions(List<Transaction> list) {
        list.stream()
            .filter(t -> t.getAmount() > 5000)
            .forEach(t -> System.out.println(t.getCustomerName() + " : " + t.getAmount()));
    }

    public void totalCredit(List<Transaction> list) {
        double total = list.stream()
            .filter(t -> t.getType().equals("CREDIT"))
            .mapToDouble(Transaction::getAmount)
            .sum();
        System.out.println("Total Credit: " + total);
    }

    public void totalDebit(List<Transaction> list) {
        double total = list.stream()
            .filter(t -> t.getType().equals("DEBIT"))
            .mapToDouble(Transaction::getAmount)
            .sum();
        System.out.println("Total Debit: " + total);
    }

    public void sortTransactions(List<Transaction> list) {
        list.stream()
            .sorted(Comparator.comparingDouble(Transaction::getAmount))
            .forEach(t -> System.out.println(t.getCustomerName() + " : " + t.getAmount()));
    }

    public void highestTransaction(List<Transaction> list) {
        list.stream()
            .max(Comparator.comparingDouble(Transaction::getAmount))
            .ifPresent(t -> System.out.println(
                "Highest Transaction: " + t.getCustomerName() + " : " + t.getAmount()
            ));
    }
}
