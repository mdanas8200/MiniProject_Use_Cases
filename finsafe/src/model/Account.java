package model;
import model.Transaction;
import java.util.*;

public class Account {
    private final String accountHolder;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public Account(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.transactionHistory=new ArrayList<>();
        this.transactionHistory.add(new Transaction(accountHolder, balance,TransactionType.DEPOSIT ));
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
