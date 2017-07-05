// Interfaces

// Declaring interfaces
import java.lang.*;

public interface NameOfTheInterface{
}

//Example
//Support files
interface Animal{
    
    public void eat();
    public void travel();
}
//MAin files 
public class MammalDemo implements Animal{
    
    public void eat(){
        System.out.println("Mammal can eat .");
    }
    
    public void travel(){
        System.out.println("Mammal can travel.");
    }
    
    public static void main(String[] args){
        MammalDemo mam = new MammalDemo();
        
        mam.eat();
        mam.travel();
        
    }
}

//Extending Interfaces example

// Filename: Sports.java
public interface Sports{
	
	public void setHomeTeam(String name);
	public void setAwayTeam(String name);
	
}

//Filename :  Football
public interface Football extends Sports{
	
	public void homeTeamScored(int points);
	public void vistingTeamScored(int points);
	public void qtrEnds(int qtr);
	
}	

public interface Basketball extendsw Sports{
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfTheHalf(int half);
	public void overTime(int ot);

}

// Extending Multiple Interfaces

//example

public interface Hockey extends Sports, Event



	
	
	
	
	