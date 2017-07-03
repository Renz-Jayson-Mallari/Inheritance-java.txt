// Encapsulation --> also known as data hiding.

// example

// Main

public class EncapDemo{
    
    public static void main(String[] args){
        
        EncapTest et = new EncapTest();
        
        et.setName("Renz Jayson");
        et.setId("0200261cs");
        et.setAge(32);
        
        System.out.println("Name: " + et.getName() + 
                            "\nId: "+ et.getId() + 
                            "\nAge: "+ et.getAge() );
        
    }
}

// Support class 

public class EncapTest{
    
    private String name;
    private String idNum;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public String getId(){
        return idNum;
    }
    
    public void setId(String newId){
        idNum = newId;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
}