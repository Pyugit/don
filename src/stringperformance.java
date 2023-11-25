
public class stringperformance {

	
		
	 public static String concatwithstring()
	 {
		 String s="java";
		 
		 for(int i=0;i<100000;i++)
		 {
			 s=s+"doc";
		 }
		 return s;
	 }
	 
	 public static String concatwithstringbuffer()
	 {
		 StringBuffer s=new StringBuffer("java");
		 
		 for(int i=0;i<100000;i++)
		 {
			 s.append("doc");
		 }
		 return s.toString();
	 }

	 public static String concatwithstringbuilder()
	 {
		 StringBuilder s=new StringBuilder("java");
		 
		 for(int i=0;i<100000;i++)
		 {
			 s.append("doc");	
		 }
		 return s.toString();
		 
	 }
	
	 public static void main(String[] args) {
	
		 long startTime=System.currentTimeMillis();
		 concatwithstring();
		 System.out.println("time by string to cancat : "+(System.currentTimeMillis()-startTime)+"ms");
	 
		 startTime=System.currentTimeMillis();
		 concatwithstringbuffer();
		 System.out.println("time by stringbuffer to cancat : "+(System.currentTimeMillis()-startTime)+"ms");
		 
         startTime=System.currentTimeMillis();
		 concatwithstringbuilder();
		 System.out.println("time by stringbuilder to cancat : "+(System.currentTimeMillis()-startTime)+"ms");
		 System.out.println(System.currentTimeMillis());
	 }

}
