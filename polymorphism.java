// Polymorphism

public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}

// Deer IS-A Animal
// Deer IS-A Vegetarian
// Deer IS-A Deer
// Deer IS-A Object

// Example 1

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