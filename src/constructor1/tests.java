package constructor1;

public class tests {
	boolean a=true;
	 String j;
	static double b;
	 char b1;
	
	
	boolean c;
//	tests()
//	{
//      System.out.println("this is zero para. constructor12   "+a+j+b+b1+c);
//	}
	void tes()
	{//j="kk";
   // wrong  System.out.println("this is zero paraf. constructor  "+var.b+j+a+b1);
	 }
	
//	 tests(String a,int b)
//	{
//      System.out.println(a);
//   //   System.out.println("this is 2 para. constructor  "+a+j+b1);
//      System.out.println(b);
//   //   System.out.println(c);
//	}

	public static void main(String[] args) {
		 // test var1=new test();
    tests var=new tests();
   
      System.out.println(b);	
      System.out.println(var.j);
      var.tes();
      var.j="lk";
//      tests var1=new tests();
//      var1.j="oi";
//      var1.tes();
    // test1 var1=
    	//	  new test1();
    // new tests("jj",2);
     // System.out.println(var1.b);
      //System.out.println(c);n//Cannot make a static reference to the non-static field c
	}

}
