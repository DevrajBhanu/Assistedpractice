package package3;

import java.util.LinkedHashMap;
import java.util.Map;

public class hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	        
	        linkedHashMap.put(1, new String("Apple"));
	        linkedHashMap.put(2, new String("Banana"));
	        linkedHashMap.put(3, new String("Guava"));
	        linkedHashMap.put(4, new String("Papaya"));
	        linkedHashMap.put(5, new String("Orange"));
	        linkedHashMap.put(6, new String("Mango"));
	        linkedHashMap.put(7, new String("Pineapple"));
	        linkedHashMap.put(8, new String("kiwi"));
	        linkedHashMap.put(9, new String("Cucumber"));
	        linkedHashMap.put(10, new String("Dragon fruit"));
	        
	        
	        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
	        System.out.println("\nRemove entry for value 4 : " + linkedHashMap.remove("Papaya"));
	        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));
	        System.out.println("LinkedHashMap contains Banana as value? : " + linkedHashMap.containsValue("Banana"));
	        //System.out.println("\nValues of map after iterating over it : ");
	        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
	        System.out.println( "Hashcode value: "+linkedHashMap.hashCode());
	        
	        
	       

	}

}
