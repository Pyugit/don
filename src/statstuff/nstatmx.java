package statstuff;

public class nstatmx {
	int a=5;
	String str="classday";
	void test()
	{
		System.out.println("this is test method");
	}
	
	{
		System.out.println("nonstat blok");
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main merhod started");
		nstatmx objrefvar=new nstatmx();
		System.out.println(objrefvar.a);
		System.out.println(objrefvar.str);
		objrefvar.test();
		
		System.out.println("main method ended");
				
		
	}

}