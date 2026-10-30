public class Transaction {

    private int transactionId;
    private String customerName;
    private String type;
    private double amount;

    public Transaction(int transactionId, String customerName,
                       String type, double amount) {
        this.transactionId = transactionId;
        this.customerName = customerName;
        this.type = type;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
