package package1;
public class Access_MOdifier2
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
  private void display1() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
  protected void display2() 
  {    display2();
      System.out.println("This is protected access specifier"); 
  }
  public static void main(String[] args) {
		
		Access_MOdifier2 obj = new Access_MOdifier2(); 		  
      obj.display(); 
      
      obj.display2(); 

	}
}



	




