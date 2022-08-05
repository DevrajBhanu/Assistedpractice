package package3;

public class Customexception extends Exception{
	
	Customexception(String s)
	{
		super(s);
	}
	public static void validate(int salary) throws Customexception
	{
		if(salary<2100)
		{
			System.out.println("Salary Amount= "+salary);
			throw new Customexception("You need to Work Hard");
		}
		if(salary>=2100 && salary<=5000)
		{
			System.out.println("Salary Amount= "+salary);
			throw new Customexception("You salary is somehow good");
		}
		if(salary>=5100 && salary<=9000)
		{
			System.out.println("Salary Amount= "+salary);
			throw new Customexception("You salary is very good");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(9000);
			
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}

	}

}
