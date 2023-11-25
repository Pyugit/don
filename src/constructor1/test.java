package constructor1;

public class test {
	boolean a;
	String j;
	double b;
	 char b1;
	test()
	{
     System.out.println("this is zero para. constructor");
	 }
	test(String a)
	{
      System.out.println(a);
      System.out.println("this is one para. constructor");
	}

	public static void main(String[] args) {
		
      test var=new test();
      System.out.println(var.b1);	
      System.out.println(var.j);	
      System.out.println(var.a);
      //test var1=
    		  new test("rj");
	}

}
