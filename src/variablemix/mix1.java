package variablemix;

public class mix1 {
	int a=1;
	String str ="hj";
	
	static int b=11;
	static String strr="kl";
	
	static void show()
	{
		System.out.println("static show");
	}

	void showw()
	{
		System.out.println("nonstatic showw");
	}
	
	{
		System.out.println("nonstatic blok1");
	}
	
	{
		System.out.println("nonstatic blok2");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mix1 var=new mix1();
		
		System.out.println(strr);
		
		show();
		System.out.println(b);
		
	//	mix1 var=new mix1();
		var.showw();
		show();
	}
	static
	{
		System.out.println("static blok1");
	}
    
	static
	{
		System.out.println("static  blok2");
	}

}
