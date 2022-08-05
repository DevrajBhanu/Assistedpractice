package package3;

abstract class parent
{     int speed;
      long distance;
    parent()
    {
    	speed=10;
    	distance=50L;
    }
    parent(int s,long dist)
    {System.out.println("parent class called");
    	speed=s;
    	distance=dist;
    }
    
	abstract void run();
    abstract void stop();
    public void fuel(int a)
    {
    	
    }
    public void fuel(float b,String s)
    {
    	
    }
    public void fuel(char ch,int c)
    {
    	
    }   

}
class child extends parent{
	 int speed;
     long distance;
     int nos_of_tyre=2;
	 
     child()
	{  super(20,30);
		speed=20;
		distance=60;
	}
	public void run()
	{
		System.out.println("Run method called");
		
	}
	public void stop()
	{
		System.out.println("Stop method called");
		
	}
	public void display()
	{  System.out.println("Printing Variables of Child class");
		System.out.println("Speed= "+speed);
		System.out.println("distance= "+distance);
		System.out.println("No of tyres= "+nos_of_tyre);
		System.out.println("Printing variables of parent class");
		System.out.println("Speed= "+super.speed);
		System.out.println("distance= "+super.distance);
		
		
	}
}


public class wheelersAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         parent p=new child();
         p.run();
         p.stop();
        child c=new child();
        c.display();
	}

}
