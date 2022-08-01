package package1;
import java.util.*;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist
				
				ArrayList<String> ct=new ArrayList<String>();   
			      ct.add("Punjab");//
			      ct.add("Bihar");  
			      System.out.println("Printing ArrayList Items");
			      System.out.println(ct);  
				
				// vector
			      System.out.println();
			      
			      Vector<Integer> ve = new Vector();
			      ve.addElement(15); 
			      ve.addElement(30);
			      System.out.println("Printing Vector Items");
			      System.out.println(ve);
				
				// linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Dev");  
			      names.add("Raj");  	      
			      Iterator<String> itr=names.iterator();  
			      System.out.println("Printing LinkedList Items");

			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			      }
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(10);  
			       set.add(13);  
			       set.add(12);
			       set.add(14);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("Printing LinkedHashSet Items");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(101);  
			       set2.add(105);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	} 

		
		
	}


