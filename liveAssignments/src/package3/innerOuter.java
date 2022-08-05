package package3;
 class Employee{
	int salary=10000;
	class permEmployee
	{
		String code="PE01";
		double hike=0.45;
		public void new_salary()
		{
			double total=salary*hike;
			System.out.println("Perm  Employee");
			System.out.println("Salary= "+total+" Code= "+code+" Hike= "+hike);
		}
	}
	class tempEmployee
	{

		String code="TE01";
		double hike=0.30;
		public void new_salary()
		{
			double total=salary*hike;
			System.out.println("Temp Employee");
			System.out.println("Salary= "+total+" Code= "+code+" Hike= "+hike);
		}
	}
	void role()
	{
		class contractEmployee
		{

			String code="CE01";
			double hike=0.30;
			public void new_salary()
			{
				double total=salary*hike;
				System.out.println("Contaract Employee");
				System.out.println("Salary= "+total+" Code= "+code+" Hike= "+hike);
			}
		}
		contractEmployee obj1=new contractEmployee();
		obj1.new_salary();
	}
}
public class innerOuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Employee.permEmployee obj2=emp.new permEmployee();
		obj2.new_salary();
		Employee.tempEmployee obj3=emp.new tempEmployee();
		obj3.new_salary();
		emp.role();
		
		

	}

}
