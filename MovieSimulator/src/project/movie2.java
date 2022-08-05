package project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class movie2 {
	static Scanner sc=new Scanner(System.in);static String bdate,stime;static int sno;
	static ArrayList<String> bookings=new ArrayList<String>();static int calculate;
	
	public static void add(ArrayList arl)
	{
		for(int i=0;i<10;i++)
		{
			arl.add(i,0);
			
		}
	}
	public static void seatcalci(ArrayList arl)
	{  int c=0;
	  if(arl.size()==0)
	  {
		  add(arl);
	  }
		for(int i=0;i<arl.size();i++)
		{
			if((arl.get(i)).equals(1))
			{
				c++;
			}
		}
		if(c<=10)
	   {
		System.out.println("Enter Seat Number");
		sno=Integer.parseInt(sc.nextLine());
		if((arl.get(sno-1)).equals(0))
				{
		arl.set(sno-1,1);
		calculate++;
				}
		else{
			System.out.println("Seat is already Booked");
			System.out.println("Please select any other seat");
			seatcalci(arl);
		}
	    }
	else
	{
		System.out.println("Badluck!! Seat is full");
	}
		
	}
	public static  void seat()
	{  String ch="y";String rno;
		ArrayList<Integer> lst1=new ArrayList<Integer>();
	   ArrayList<Integer> lst2=new ArrayList<Integer>();
	   ArrayList<Integer> lst3=new ArrayList<Integer>();
	   ArrayList<Integer> lst4=new ArrayList<Integer>();
	   ArrayList<Integer> lst5=new ArrayList<Integer>();
		
		
	   while(ch.equals("y") || ch.equals("Y")){
		System.out.println("The five rows are A-E ");
		System.out.println("          [...Screen...]        ");
		System.out.println("A-A1 A2 A3 A4 A5     A6 A7 A8 A9 A10-A");
		System.out.println("B-B1 B2 B3 B4 B5     B6 B7 B8 B9 B10-B");
		System.out.println("C-C1 C2 C3 C4 C5     C6 C7 C8 C9 C10-C");
		System.out.println("D-D1 D2 D3 D4 D5     D6 D7 D8 D9 D10-D");
		System.out.println("E-E1 E2 E3 E4 E5     E6 E7 E8 E9 E10-E");
		System.out.println("Choose the row from A-E");
		rno=sc.nextLine();
		rno=rno.toUpperCase();
		
		if(rno.equals("A"))
				{
			seatcalci(lst1);
				}
		else if(rno.equals("B"))
			{
			seatcalci(lst2);
			}
		else if(rno.equals("C"))
			{
			seatcalci(lst3);
			}
		else if(rno.equals("D"))
			{
			seatcalci(lst4);
			}
		else if(rno.equals("E"))
			{
			seatcalci(lst5);
			}
		else{
			System.out.println("Wrong Input!! Error");
		}
		
		String str=rno.concat(Integer.toString(sno));
		bookings.add(str);
		
		System.out.println("Ticket is booked with Seat no: "+bookings);
		System.out.println("Do you want to book more tickets? Enter 'y' for yes otherwise No");
		 ch=sc.nextLine();
		}
	   System.out.println();
	   System.out.println("Costing of 1 Ticket is 300");
	   System.out.println("You have Booked "+calculate+" Tickets!! "+"Pay "+(calculate*300)+"Amount to Confirm Booking");
	  int str1=sc.nextInt();
	   if(str1==(calculate*300))
	   {
	   System.out.println("Congratulation!! Your Ticket is Booked Successfully");
	   System.out.println("Ticket is booked with Seat no: "+bookings+" for "+bdate+" with showtime from  "+stime);
	   System.out.println("Thankyou For Visting");
	   }
	   else{
		   System.out.println("Thankyou For Visting");
	   }
	}
	public static  void menu()
	{   
		System.out.println("Enter Show Time:");
		System.out.println("1.9am to 12 pm");
		System.out.println("2.2pm to  5pm");
		System.out.println("3.8pm to 11 pm");
		int st=Integer.parseInt(sc.nextLine());
		switch(st)
		{
		case 1:
			stime="9am to 12 pm";
			break;
		case 2:
		 stime="2pm to  5pm";
			break;
		case 3:
			 stime="8pm to 11 pm";
				break;
		default:
					System.out.println("Showtime not available");
					System.out.println("Please choose available showtime");
					menu();
					break;
					}		
		            seat();
	
		
	}
     public static boolean  admin(int i,String a_user,String a_password)
	{
		System.out.println("Enter username:");
    	String uname=sc.nextLine();
    	System.out.println("Enter Password:");
    	String pass=sc.nextLine();
    	if(a_user.equals(uname) && a_password.equals(pass))
    	{
    		System.out.println("Login Successful ");
    		System.out.println("Welcome to portal");
    		return true;
    	}
    	else{
    		System.out.println("Invalid Username or Password");
    		return false;
    	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a_user="admin";
		String a_password="123";
		System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to Movie Booking Simulator \n");
        System.out.println("Today's Movie is The Scorpion King");
        System.out.println("**************************************");
        
        System.out.println("Welcome Administrator Please enter your choice:");
        System.out.println("1.Login");
        System.out.println("2.Update Password");
        int choice=Integer.parseInt(sc.nextLine());
        
        if(choice==1)
        {
        	if(admin(choice,a_user,a_password)){
        		System.out.println("Enter boooking date for the show- The Scorpion King");
        		bdate=sc.nextLine();
        		menu();
        		
        	}
        	
        }
        if(choice==2)
        {
        	System.out.println("Enter new Password:");
        	String np=sc.nextLine();
        	a_password=np;
        	System.out.println("You have Succesfully changed your password");
        	System.out.println("Login Again");
        	if(admin(choice,a_user,a_password))
        	{  System.out.println("Enter boooking date for the show- The Scorpion King");
    		bdate=sc.nextLine();
        		menu();
        	}
        	
        }	

	}

}
