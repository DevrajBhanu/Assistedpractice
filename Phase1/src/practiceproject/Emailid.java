package practiceproject;
import java.util.Scanner;
public class Emailid {
    
    //int length;
	int flag=0;
    public void check(String regid[],String str,int l)
    {
    	for(int i=0;i<l;i++)
    	{
    		if(regid[i].equals(str))
    		{
    			flag=1;
    		}
    	}
    	     if(flag==1)
    	     {
    	    	 System.out.println("Employee email-id is present ");
    	     }
    	else
    		{
    			System.out.println("Employee email-id is not present ");	
    		}
    	
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		String regid[]={"xyz@gmail.com","wer@hotmail.com","abc@yahoo.com","qwe@rediffmail.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email-id to search ");
		String str=sc.nextLine();
		Emailid obj=new Emailid();
		 //obj.length=regid.length;
		length=regid.length;
		//obj.check(regid,str,obj.length);
		obj.check(regid,str,length);
		
	}

}
