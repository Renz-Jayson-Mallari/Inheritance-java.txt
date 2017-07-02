// Abstraction

//Main

public class AbstractDemo{
    
    public static void main(String[] args){
        // employee reference with salary object
        Employee e =  new Salary("Isa Lu" , "Bayside" , 30 , 45_000.00);
        e.mailCheck();
        e.computePay();
        
        System.out.println();
        
        // Salary reference and object
        Salary s = new Salary("Gene El" , "Elmhurst" , 16, 50_0000.00);
        s.mailCheck();
        s.computePay();
    }
}

// Support class file

public abstract class Employee{
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String address, int number){
        System.out.println("Constructing employee ...");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public void mailCheck(){
        System.out.println("Mailing check to " + name +  " " + address);
    }
    
    public double computePay(){
        System.out.println("Computing payment" );
        return 0.0;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String newAddress){
        address = newAddress;
    }
    
    public int getNumber(){
        return number;
    }
}


//Util class file

public class Salary extends Employee{
    
    private double salary;
    
    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }
    
    public void mailCheck(){
        System.out.println("Mailing check to " + getName() + " with the yearly salary of "+ salary);
    }
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double newSalary){
        if( newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
        double payment = salary/52;
        System.out.println("Computing payment for this week... the amount is : " + payment);
        return payment;
    }
}


//output



Compiling the source code....
$javac AbstractDemo.java Salary.java Employee.java 2>&1


Executing the program....
$java -Xmx128M -Xms16M AbstractDemo Salary Employee

Constructing employee ...
Mailing check to Isa Lu with the yearly salary of 45000.0
Computing payment for this week... the amount is : 865.3846153846154

Constructing employee ...
Mailing check to Gene El with the yearly salary of 500000.0
Computing payment for this week... the amount is : 9615.384615384615
