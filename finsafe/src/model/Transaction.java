package model;
import model.TransactionType;
public class Transaction {
    private final String username;
    private final double amount;
    private final TransactionType type;

    public Transaction(String username, double amount, TransactionType type){
        this.username=username;
        this.amount=amount;
        this.type=type;
    }

    public String getUsername() {
        return username;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType(){
        return type;
    }
}
