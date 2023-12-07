package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
	 
	List <String> list=new ArrayList<>();
	
	Map<String,Integer> obj =new HashMap<>();
	
	
	obj.put("Sai", 1);
	obj.put("raj", 9);
	obj.put("rahul", 4);
	obj.put("ramu", 7);
	
	System.out.println(obj);
	
	
	
	/// adding the name
	list.add("Sai");
	
	list.add("Satya");
	list.add("raj");
	list.add("rahul");
	list.add("lucky");
	System.out.println(list);
	
	for(String n:list) {
		System.out.println(n);
		
	}
	

	}

}
