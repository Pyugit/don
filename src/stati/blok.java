package stati;

public class blok {
	String str="";
	static String str1="";
	
	static String a[]= {"sd","df","fg","jh"};
    
    static//blok1
    {
    	System.out.println("this is static blok");
    }
   
    static void  test()//method
	{
    	System.out.println("this is test method");
	}
   
    //nonstatic blok1
    {
    	System.out.println("this is non static blok1");
    }
    //nonstatic blok2
    
    {
    	System.out.println("this is non static blok2");
    }
	
    public static void main(String[] args) {
		 test();
		 System.out.println(str1.length());
	blok obj=new blok() ;
	 obj.str.length();System.out.println(obj.str.length()+"   "+a.length);
		
		
	test();

	blok obj1=new blok() ;
	}
	
    
    
	static//blok2
	    {
	    	System.out.println("this is static blok1");
	    }
	

}
