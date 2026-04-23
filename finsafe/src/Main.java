import java.util.*;
import model.Account;
import exception.InSufficientFundsException;
import service.TransactionService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Account Creation");
        System.out.print("Enter Username: ");
        String name = sc.nextLine();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(name, balance);
        TransactionService service=new TransactionService();

        while(true){
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Mini Statement\n4. Exit\n");
            System.out.print("Select Choice: ");
            int choice=sc.nextInt();

            try{
                double amt;
                switch (choice){
                    case 1:
                        System.out.print("Enter amount: ");
                        amt=sc.nextDouble();
                        service.deposit(account, amt);
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        amt = sc.nextDouble();
                        service.withdraw(account, amt);
                        break;
                    case 3:
                        service.printMiniStatement(account);
                        break;
                    case 4:
                        System.out.print("Thank You For Banking");
                        return;

                    default:
                        System.out.println("Invalid Choice.");
                }
            }catch (InSufficientFundsException e){
                e.printStackTrace();
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
    }
}