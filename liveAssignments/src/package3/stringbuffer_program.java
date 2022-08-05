package package3;

 class strbuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Started Java");
		s.append("Phase1");
		System.out.println("After appending phase1 string buffer is : "+s);
		s.delete(2,5);
		System.out.println("After deleting from 2,5 index string buffer is : "+s);
		s.replace(5, 9,"Python");
		System.out.println("After appending phase1 string buffer is : "+s);
	}

}

