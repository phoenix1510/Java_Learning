//Create two methods namely credit and getBalance. The first one adds the amount (passed as parameter) to balance and does not return any data.
//The second method allows clients (i.e. the other classes that use this class) to obtain the value of a particular Account object’s balance.
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