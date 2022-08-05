package package3;

 class encapsulatedclass {
	private int securitycode=845;
	private String branchname="CSE";
	private int branchcode=8465;
	private String deptname="DGCF";
	private int deptcode=8564;
	

	public int getSecuritycode() {
		return securitycode;
	}


	


	public String getBranchname() {
		return branchname;
	}


	

	public int getBranchcode() {
		return branchcode;
	}
	public String getDeptname()
	{
		return deptname;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulatedclass obj=new encapsulatedclass();
		System.out.println(obj.getBranchcode());
		System.out.println(obj.getBranchname());
		System.out.println(obj.getSecuritycode());
		System.out.println(obj.getDeptname());
		
		
		

	}

}
