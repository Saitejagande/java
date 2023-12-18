package Collections;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> names=new HashSet<String>();
System.out.println("names.isEmpty():"+names.isEmpty());
	//adding elements/Objects
names.add("Sai Teja");
names.add("Gande");
if(names.isEmpty())
	System.out.println("names hash set is still empty");
else
	System.out.println("Size of hashset names:"+names.size());
	if(names.contains("Gande"))
		names.remove("Gande");
	System.out.println("updated size of hashset:"+names.size());
	names.clear();
	System.out.println("names.isEmpty after clear:"+names.isEmpty());
	
	
	}

}
