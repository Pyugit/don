package accessmod1;

import accessmod.publicc;

public class publicc2    {//  no extend needed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicc obj=new publicc();//polymorphism 
		
		//publicc obj=new publicc();
		obj.display();
		obj.test();
		System.out.println(obj.a);
	}


//public class publicc2 extends publicc   {
//
//	public static void main(String[] args) {
//	

	//		publicc obj=new publicc2();//polymorphism 
//		
//		//publicc obj=new publicc();
//		obj.display();
//		obj.test();
//		System.out.println(obj.a);
//	}
//
//}


//public class publicc2 extends publicc   {
//
//	public static void main(String[] args) {
//		
//		publicc2 obj=new publicc2();//polymorphism 
//		
//		//publicc obj=new publicc();
//		obj.display();
//		obj.test();
//		System.out.println(obj.a);
//	}
//
//}


}