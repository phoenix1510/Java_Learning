//Write another method debit in the above program that withdraws money from an Account. Ensure that the debit amount does not exceed the
//Account’s balance. In that case the balance should be left unchanged and the method should print a message indicating “Debit amount exceeded
//account balance”. Modify class AccountTest to test method debit.
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
    void debit(double debam){
        if(debam>this.balance){
            System.out.println("Not enough balance to debit given amount.");
        }
        else{
            this.balance-=debam;
            System.out.println("Amount "+debam+" debited from account");
            System.out.println("Balance after debit: "+this.getBalance());
        }

    }
}
public class Ques49{
    public static void main(String arg[]){
        Account a1= new Account(1000);
        System.out.println("Initial Balance: "+a1.getBalance());
        a1.credit(500.0);
        System.out.println("Balance after credit: "+a1.getBalance());
        a1.debit(500.0);
    }
}