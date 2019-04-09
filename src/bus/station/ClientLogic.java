package bus.station;

import java.util.ArrayList;
public class ClientLogic {
	

   private ArrayList<String> array;
   private String name1 = "Mirna";
   private String name2 = "Narimane";



public ClientLogic() {
	array = new ArrayList<String>();
	array.add(name1);
	array.add(name2);
}
public ArrayList<String> getArray(){
	return array;
	
}
public void setArray(ArrayList<String> array){
	this.array = array;
	
}
}
