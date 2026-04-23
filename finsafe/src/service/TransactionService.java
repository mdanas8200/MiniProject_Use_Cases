package service;
import model.*;
import exception.InSufficientFundsException;

public class TransactionService {
    public void deposit(Account account, double amount){
        if(amount<=0)throw new IllegalArgumentException("Deposit Amount Should be Positive");
        else {
            account.setBalance(account.getBalance() + amount);
            addTransaction(account, amount, TransactionType.DEPOSIT);
            System.out.println("Amount Deposited");
        }
    }

    public void withdraw(Account account,double amount) throws InSufficientFundsException {
        if (amount<=0) throw new IllegalArgumentException("Withdraw Amount must be Positive");
        if (amount>account.getBalance()) throw new InSufficientFundsException("Insufficient Balance.");

        account.setBalance(account.getBalance()-amount);
        addTransaction(account, amount,TransactionType.WITHDRAW);
        System.out.println("Amount Withdrawn");
    }

    private void addTransaction(Account account, double amount, TransactionType type){
        account.getTransactionHistory().add(new Transaction(account.getAccountHolder(), amount, type));
    }

    public void printMiniStatement(Account account){
        System.out.println("Mini Statement:");
        int size=account.getTransactionHistory().size();
        int start=Math.max(0,size-5);

        for (int i=start;i<size;i++){
            Transaction transaction=account.getTransactionHistory().get(i);
            System.out.println(transaction.getType()+" : "+transaction.getAmount());
        }

        System.out.println("Account Balance: "+account.getBalance());
    }
}
