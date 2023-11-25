
public class strng {

	public static void main(String[] args) {
		 
		
			StringBuffer st=new StringBuffer("jo");
			st.append("hn");
			System.out.println(st);   //john mutable
			
			String st1=new String("jo");
			String st3=st1.concat("hn");
			String st4=new String("jo");
			
			System.out.println(st1);  //jo  immutable
			
			st1=st1.concat("hn");
			System.out.println(st1);  //john new string formed when explicitely 
			System.out.println(st3);
			System.out.println(st4);  //jo  non-constant pull area,dupli. allowed
			
			StringBuilder st2=new StringBuilder("jo");
			st2.append("hn");
			System.out.println(st2);  //mutable
				}
			
}
