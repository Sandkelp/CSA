public class BankAccount{
    String accountHolder;
    private int accountNumber;
    private double accountBalence;

    private static int BankAccountNum;

    public BankAccount(){
        //default values 
        BankAccountNum++;
    }

    public BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountBalence = accountBalence;
        BankAccountNum++;
    }

    public BankAccount(String accountHolder, int accountNumber, int accountBalence){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalence = accountBalence;
        BankAccountNum++;
    }

    public String toString(){
        return this.accountHolder + ", " + this.accountBalence;
    }

}

