package statstuff;

public class mix {
	static int a=10;
	static String str ="rj";
	
	static void test()
	{
		System.out.println("this is static test method");
	}
	
	static 
	{
		System.out.println("this is static blok");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main merhod started");
		System.out.println(a);
		System.out.println(str);
	    test();
	    System.out.println("main merhod ended");
		
	}
}
