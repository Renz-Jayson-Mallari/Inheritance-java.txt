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

/*Set CLASSPATH System Variable

To display the current CLASSPATH variable, use the following commands in Windows and UNIX (Bourne shell) −

    In Windows → C:\> set CLASSPATH
    In UNIX → % echo $CLASSPATH

To delete the current contents of the CLASSPATH variable, use −

    In Windows → C:\> set CLASSPATH =
    In UNIX → % unset CLASSPATH; export CLASSPATH

To set the CLASSPATH variable −

    In Windows → set CLASSPATH = C:\users\jack\java\classes
    In UNIX → % CLASSPATH = /home/jack/java/classes; export CLASSPATH
*/