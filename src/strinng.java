
public class strinng {

	public static void main(String[] args) {
		 String s="java is independent ";
		 String s1="java is independent ";//duplicates not allowed
		 String ss="jAva is independent ";//duplicates not allowed
		 
		 String s2=new String("java is independent ");
		 String s3=new String("java is independent ");//duplicates allowed
		 String s4=new String("Java is independent ");//duplicates allowed

		// s2=s3;
		 System.out.println(s==s1);//true
		 System.out.println(s==s3);//false

		 System.out.println(s1==s2);//false
		 System.out.println(s2==s3);//false
		 
		 System.out.println("---equals---");
		 
		 System.out.println(s.equals(s1));//true
		 System.out.println(s.equals(ss));//false

		 System.out.println(s.equals(s2));//true
		 System.out.println(s.equalsIgnoreCase(s4));//true
		 

		 System.out.println(s2.equals(s4));//false
		 System.out.println(s2.equals(s4.toLowerCase()));//true
		 
		 System.out.println("===concate===");
		 
		 String j=s.concat(" l");
		 System.out.println(s.concat("")+" "+j.length()+" "+j);
		 
		 System.out.println("===methods===");
		 
		 Object i= s.length();
		 System.out.println(i);
		 String d=s.substring(1,7);
		 String d1=s.substring(5);
		 System.out.println(d+d1);
		 
		 int r=s.indexOf('i');
		 System.out.println(r);
		 
		int a= s.charAt(0);
		char c=s.charAt(0);
		System.out.println(c+"-->"+a);
		
		String h= null;
	//	System.out.println(h.length());//Null pointer access: The variable h can only be null at this location
		String h1= "";
		System.out.println(h1.length()+"  "+h);
		
		System.out.println("===toCharArry()===");
		String x="aunannva vaa dil";
		char[]g=x.toCharArray();
		
		System.out.print("{");
		for(int k=0;k<g.length;k++)
			System.out.print(g[k]+",");

		System.out.print("}");
		
	}

}
