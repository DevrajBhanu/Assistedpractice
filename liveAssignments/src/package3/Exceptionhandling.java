package package3;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n2=0;
        int n1=20;
        int n3;
        try
        {
        	//JVM always prior to 1st exception and choose that type of catch block only.
        	n3=n1/n2;//As soon as it get exception it will go to exception then finally block it will skip remaining lines and never come back to try block
        	n3=n2-n1;//skipped so for this there is nested try concept.
        	System.out.println("Result"+n3);
        
        }
        catch(ArithmeticException ae)
        {
        	System.out.println("Number cannot divided by zero");
        	System.out.println("I am before subclass operation");
        	//System.out.println(ae.getMessage());
        	
        }
        catch(NullPointerException ae)
        {
        	System.out.println("Number cannot divided by zero");
        }
        //if no catch block given exception type is true this catch block is executed
        catch(Exception ae)
        {
        	System.out.println(ae.getMessage());
        }
       
        finally{
        	
        	n3=n1+n2;
        	System.out.println("Addition of 2 number="+n3);
        	System.out.println("this block will always executed");
        	check();
        }
	}
	//if no catch block executes exception will go to JVM after execution of finally block
	//there must be possiblity of having no catch block then exception  it will go to JVM
public static void check()
{    
	try
	{
		int n3=20/0;
		
	}
	finally{
		System.out.println("Nested try exception occured");
	}
	
}
}
