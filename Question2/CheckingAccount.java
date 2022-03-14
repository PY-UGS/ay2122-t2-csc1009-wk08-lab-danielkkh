public class CheckingAccount {
    private double balance;
    private String accNum;

    public CheckingAccount(String accNum){
        this.accNum=accNum;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccNum(){
        return this.accNum;
    }

    public void withdraw(double withdrawAmount) throws InsufficientFundsException{
        if(this.balance<withdrawAmount){
            throw new InsufficientFundsException(withdrawAmount-this.balance);
        }
        else {
            this.balance-=withdrawAmount;
        }
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
    }
}