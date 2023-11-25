package stati;

public class Void {
	String st=null;
	String str="";
	static String str1="";
	
	static String a[]= {"sd","df","fg","jh"};
    
    static//blok1
    {
    	System.out.println(  (true||false)+""+(1+1));
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
    	
    //	String s[]= {test()};//Type mismatch: cannot convert from void to String
		 test();
		 System.out.println(str1.length());
	Void obj=new Void() ;
	// obj.str.length();System.out.println(obj.str.length()+"   "+a.length+""+(test());
		
		
//	System.out.println(test());//The method println(boolean) in the type PrintStream is
	//not applicable for the arguments (void)

	Void obj1=new Void() ;
	}
	
    
    
	static//blok2
	    {
	    	System.out.println("this is static blok1");
	    }
	

}
