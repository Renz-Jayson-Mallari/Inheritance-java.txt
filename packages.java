//packages

// javac -d Destination_folder file_name.java

//Example
/* File name : Animal.java */
package animals;

interface Animal {
   public void eat();
   public void travel();
}

//another example
// Support class
package animals;

interface Animals{
    
    public void eat();
    public void travel();
}

//Main Class


package animals;

public class MammalInt{
    
    public void eat(){
        System.out.println("Mammals eats...");
    }
    
    public void travel(){
        System.out.println("Mammal travels ... " );
    }
    
    public static void main(String[] args){
        MammalInt mal = new MammalInt();
        
        mal.eat();
        mal.travel();
    }
}