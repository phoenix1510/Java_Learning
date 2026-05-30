//Create a class Account with an instance variable balance (double). It should contain a constructor that initializes the balance, ensure that the
//initial balance is greater than 0.0.
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
}