package package3;

import java.util.ArrayList;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       ArrayList<String> al=new ArrayList<String>();  
		
		System.out.println("Initial size of Arraylist is "+ al.size());  // SIZE OF ARRAYLIST
		
		al.add("apple");
		al.add("banana");
		al.add("pineapple");
		al.add("papaya");
		al.add("orange");
		al.add("guava");
		al.add("banana");
		al.add("Punjab");
		al.add("Mumbai");
		al.add("Cricket");
		al.add("Dance");
		System.out.println("Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size());
		// UPDATED SIZE OF ARRAYLIST
		
		System.out.println("Do it contains cricket"+al.contains("Cricket"));
		
		al.remove("Dance");
		al.remove("guava");
		al.remove("Punjab");
		System.out.println(al);
		System.out.println("elemet at 4,6 index"+al.get(4)+" "+al.get(6));
		
		
		
	}

}
