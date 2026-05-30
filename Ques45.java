//Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two employee objects and display each
//object’s yearly salary
//Queston 45 class = employee test public class.
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
public class Ques45{
    public static void main(String arg[]){
        Employee e1= new Employee("Harshil","Soni",50000);
        Employee e2= new Employee("Rohit","Sharma",60000);
        System.out.println("Employee 1:");
        e1.getFirstName();
        e1.getLastName();
        System.out.println("Yearly Salary: "+(e1.MSalary*12));
        System.out.println("Employee 2:");
        e2.getFirstName();
        e2.getLastName();
        System.out.println("Yearly Salary: "+(e2.MSalary*12));
    }
}