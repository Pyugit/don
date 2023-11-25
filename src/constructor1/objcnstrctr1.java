package constructor1;

public class objcnstrctr1 {

	  int a=100;
      int b=200;
      int aa;
      void test(int a,int b)
      {
    	 this.a=a;
    	 this.b=b;
    	 System.out.println(aa);
   	  
    	 aa=a;
    	  System.out.println("the value of a is"+a);
    	  System.out.println("the value of b is"+b);  
    	 System.out.println(aa);
    	  sub();
      }
      
      void addition()
      {
    	  System.out.println("this is add method");
      }
      
   
      void sub()
      {   
    	 // this("rj");//constructor call must be the first statement in a constructor
    	  addition();
    	  this.addition();
    	  System.out.println("this is sub method");
      }
      
     objcnstrctr1()
     {
    	 this("rj");//constructor from constructor
    	 System.out.println("this is constructor");
     }

     objcnstrctr1(int a)
     {
    	
    	this();
    	 System.out.println("this is int para. constructor");
         sub();//calling method from constructor
     }
	

     objcnstrctr1(String str)
     {
    	 
    	 //this(1);
    	 System.out.println("this is string para. constructor");
     }
    
     public static void main(String[] args) {
 		// TODO Auto-generated method stub
    	 
     objcnstrctr1 obj=new objcnstrctr1();
     
     obj.test(10,20);
     
     obj.sub();
     int v1 =  obj.b;
     int v2 = obj.aa;
     objcnstrctr1 obj1=new objcnstrctr1();  
  int v =  obj1.b;
  System.out.println(v+"  "+v1+"  "+v2);
    	 
    	 new objcnstrctr1("rj");
     
     new objcnstrctr1(9);
     int r=new objcnstrctr1().a;
     System.out.println(r);
     
  }  

}
