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
	