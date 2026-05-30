//Create a constructor in above class to initialize the three instance variables. Provide a get method for each instance variable.
class Employee{
    String FirstName;
    String LastName;
    double MSalary;
    Employee(String Fname,String Lname,double MS){
        this.FirstName=Fname;
        this.LastName=Lname;
        this.MSalary=MS;
    }
    void getFirstName(){
        System.out.println("First Name: "+this.FirstName);
    }
    void getLastName(){
        System.out.println("Last Name: "+this.LastName);
    }
    void getMSalary(){
        System.out.println("Monthly Salary: "+this.MSalary);
    }
}
