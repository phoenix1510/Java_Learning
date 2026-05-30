//Create class AccountTest to create and manipulate an Account object
class Account{
    double balance;
    Account(double bal){
        if(bal>0.0){
            this.balance=bal;
        }
        else{
            System.out.println("Initial balance cannot be smaller than 0.0");
        }
    }
    void credit(double am){
        this.balance+=am;
        System.out.println("Amount "+am+" credited to account");
    }
    double getBalance(){
        return this.balance;
    }
}
public class Ques48{
    public static void main(String arg[]){
        Account a1= new Account(1000);
        System.out.println("Initial Balance: "+a1.getBalance());
        a1.credit(500.0);
        System.out.println("Balance after credit: "+a1.getBalance());
    }
}