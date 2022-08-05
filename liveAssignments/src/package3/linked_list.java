package package3;

import java.util.Iterator;
import java.util.LinkedList;


public class linked_list {
	
public static void main(String a[]){
    	
    	
        LinkedList<String> ll = new LinkedList<String>();
        
        
        ll.add("April");
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("September");
        ll.add("October");
        ll.add("November");
        ll.addLast("December");
        ll.addFirst("January");
        ll.add(1, "March");
        ll.add(1,"Febuary");
        
        //ll.add(a1);    // wrapping of primitive is done automatically to convert to Integer object
                
        
        //ll.add(5, "August");
        //ll.remove(3);
                 
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("list is"+ itr.next());
        }
        System.out.println("Even months");
        for(int i=1;i<ll.size();i+=2)
        {
        	System.out.println(ll.get(i));
        }
        System.out.println("Odd Months:");
        for(int i=0;i<ll.size();i+=2)
        {
        	System.out.println(ll.get(i));
        }
        System.out.println("First month Last Month:"+ll.peekFirst()+" "+" "+ll.peekLast());
        System.out.println("Remove first and last month:"+ll.pollFirst()+" "+ll.pollLast());
        System.out.println("Does LinkedList contains 'December'? "+ll.contains("December"));
      //is used to replace   ll.set(1,"January");
       
        
       
       /* System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
               
        
       
        */
    }
}