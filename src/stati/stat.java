package stati;

public class stat {

	static byte a=10;
	static int b=20;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("add="+(a+b));
		
		System.out.println(a);
		System.out.println(b);
		
		int var=a;
		int var1=b;
		
		System.out.println("add="+(var+var1));
		
		System.out.println(stat.a);
		System.out.println(stat.b);
		
		byte i=stat.a;
		int i1=stat.b;
		
		System.out.println("add="+(i+i1));
		System.out.println("sub="+(stat.a-stat.b));
		
		stat obj=new stat();
		System.out.println(obj.a-obj.b);
		
		
	}

}
