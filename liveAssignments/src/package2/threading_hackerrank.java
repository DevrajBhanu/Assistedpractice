package package2;
import java.io.*;
class Line
{
	// if multiple threads(trains) will try to access this unsynchronized method, they all will get it. So there is chance that Object's state will be corrupted 
	//put synchronized and run
	
	synchronized public int factorial(int n)                     
	{   int p=1;
		
		for (int i = n; i > 0; i--)
		{
			p=p*i;
			
			try
			{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName());
		return p;
	}
	synchronized public int sum(int n1,int n2)                     
	{   int add;
		
		
			add=n1+n2;
			
			try
			{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		
		System.out.println(Thread.currentThread().getName());
		return add;
	}
}
class Train2 extends Thread
{int num1,num2;
	// reference to Line's Object.
	Line line;int num;

	Train2(Line line,int num1,int num2)
	{
		this.line = line;
		this.num1=num;
		this.num2=num2;
	}
	

	@Override
	public void run()
	{
		line.sum(num1,num2);
	}
}

class Train extends Thread
{
	// reference to Line's Object.
	Line line;int num;

	Train(Line line,int num)
	{
		this.line = line;
		this.num=num;
	}
	

	@Override
	public void run()
	{
		line.factorial(num);
	}
}

 class SynchronizedMethod
{
	public static void main(String[] args)
	{
		// Object of Line class that is shared among the threads.
		Line obj = new Line();

		// creating the threads that are sharing the same Object.
		Train train1 = new Train(obj,6);
		Train train2 = new Train(obj,4);
		
		train1.setName("t2");
		train2.setName("t1");

		
		
		Train2 train3 = new Train2(obj,4,5);
		Train2 train4 = new Train2(obj,20,10);
		
		train3.setName("t4");
		train4.setName("t3");

		
		train1.start();
		train3.start();
		train2.start();
		train4.start();
	}
}


