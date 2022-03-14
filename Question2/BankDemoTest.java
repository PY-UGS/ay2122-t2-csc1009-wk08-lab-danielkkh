import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args){
        CheckingAccount account = new CheckingAccount("1009");
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter deposit amount: ");
            double depositAmount = scan.nextDouble();
            account.deposit(depositAmount);
            System.out.println("Deposit successful. Your current balance is $"+account.getBalance());

            try{
                System.out.print("Enter withdraw amount: ");
                double withdrawAmount = scan.nextDouble();
                account.withdraw(withdrawAmount);
                System.out.println("Withdraw successful. Your balance is: $"+account.getBalance());
            }catch(InsufficientFundsException e){
                System.out.println("Sorry, but your account is short by: $"+ e.getAmount());
            }
        }
    }
}