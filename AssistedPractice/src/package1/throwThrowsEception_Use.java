package package1;

public class throwThrowsEception_Use {
	static int add(int num1,int num2)
	{
		if(num1>num2)
		{
			throw new ArithmeticException("Num1 is greater than 900");
		}
		else
		{
			System.out.println("Both patrameters are correct");
		}
		return num1+num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			add(30,20);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}

	}

}
