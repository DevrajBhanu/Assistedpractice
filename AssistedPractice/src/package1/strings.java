package package1;

public class strings {
	public static void main(String args[])
	{
		
		//String
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		
		System.out.println("Comparison result  between o & l is "+((o.equals(l))&&(o==l)));
		System.out.println("Comparison result  between y & p is "+((y.equals(p))&&(y==p)));
		System.out.println("Comparison result  between t & o is "+((t.equals(o))&&(t==o)));
		System.out.println("Comparison result  between k & y is "+((k.equals(y))&&(k==y)));
		System.out.println("Comparison result  between t & y is "+((t.equals(y))&&(t==y)));
		
		System.out.println(t.compareTo(o));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		
		System.out.println(t.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s6.replace('d', 'l');
		System.out.println(replace);
		
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
//Stringbuffer
		StringBuffer s=new StringBuffer("Started Java");
	s.append("Phase1");
	System.out.println("After appending phase1 string buffer is : "+s);
	s.delete(2,5);
	System.out.println("After deleting from 2,5 index string buffer is : "+s);
	s.replace(5, 9,"Python");
	System.out.println("After appending phase1 string buffer is : "+s);
	
	//StringBuilder
			System.out.println();
			System.out.println("Creating StringBuilder");
			StringBuilder sb1=new StringBuilder("Happy");
			sb1.append("Learning");
			System.out.println(sb1);

			System.out.println(sb1.delete(0, 1));

			System.out.println(sb1.insert(1, "Welcome"));

			System.out.println(sb1.reverse());
			
			//conversion	
			System.out.println("\n");
			System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
			
			String str = "Hello"; 
	        
	        // conversion from String object to StringBuffer 
	        StringBuffer sbr = new StringBuffer(str); 
	        sbr.reverse(); 
	        System.out.println("String to StringBuffer");
	        System.out.println(sbr); 
	          
	        // conversion from String object to StringBuilder 
	        StringBuilder sbl = new StringBuilder(str); 
	        sbl.append("world"); 
	        System.out.println("String to StringBuilder");
	        System.out.println(sbl);              		
	
	


}
}
