// Polymorphism

public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}

// Deer IS-A Animal
// Deer IS-A Vegetarian
// Deer IS-A Deer
// Deer IS-A Object

// Example 1


// Support class file ...
public class Employee{
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number){
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}		
	
	public void mailCheck(){
		System.out.println("mailing check to" + this.name+ " " + this.address);
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String setAddress(String newAddress){
		address =  newAddress;
	}
	
	public int getNumber(){
		return number;
	}
}

// Util class file ...
/* Filename: Salary.java */
public class Salary extends Employee{
	
	private double salary; // Yearly
	
	public Salary(String name , String address, int number, double salary){
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck(){
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing check to " + getName() + "with the salary of " + salary);
	}
	
	public double getSalary(){
		return salary;
	}
	
	public double setSalary(double newSalary){
		if (newSalary >= 0.0){
			salary = newSalary;
		}
	}
	
	public double computeSalary(){
		System.out.println("Computing the salary for " + getName() );
		return salary/52;
	}
}

//Main file
public class VirtualDemo{
	
	public static void main(String[] args){
		Salary s = new Salary("Isabelle-Lu", "Bayside,NY" , 3 , 45_000);
		Employee e = new Salary("Genel Mallari", "Emlhurst, NY", 5, 41_000);
		
		System.out.prinln("Invoking mailCheck using Salary reference");
		s.mailCheck();
		
		System.out.prinln("Invoking mailCheck using Employee reference");
		e.mailCheck();
		
	}
}