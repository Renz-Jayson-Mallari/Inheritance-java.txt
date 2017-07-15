// Data Structures

/*The Enumeration
		-- defines method by which you can enumerate
	## Method and description ##
		1-- boolean hasElements()
			-- it must return true when there is more elements to enumerate and false when all the elements has been enumerated.
		2-- Object nextElement()
			-- this will return the next Object on the enumeration as the Object reference.
			
	## Example ##
*/	

import java.util.Vector;
import java.util.Enumeration;

public class Enumeration{
	
	public static void main(String[] args){
		
		Enumeration names;
		Vector pNames = new Vector();
		
		pNames.add("Max");
		pNames.add("Ian");
		pNames.add("Renz");
		pNames.add("Jayson");
		pNames.add("Izzyabelle");
		
		names = pNames.elements();
		
		while(names.hasMoreElements()){
			System.out.println(names.nextElelemnts());
		}
		
	}
	
}



 