package package3;
 class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		System.out.println("Comparison result  between o & l is "+((o.equals(l))&&(o==l)));
		System.out.println("Comparison result  between y & p is "+((y.equals(p))&&(y==p)));
		System.out.println("Comparison result  between t & o is "+((t.equals(o))&&(t==o)));
		System.out.println("Comparison result  between k & y is "+((k.equals(y))&&(k==y)));
		System.out.println("Comparison result  between t & y is "+((t.equals(y))&&(t==y)));

	}

}

