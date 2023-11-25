package typecstng;

public class narrowing {
	public static void main(String[] args) {
		double d=97;
		float f= (float) d;
		long l=(long) f;            //  2000-127=1873      256)1700(
	 // float g=l;
		int i=(int)l;
		char c=(char)i;
		char w=(char) d;
		byte b=(byte)d;
		System.out.println(d);
		System.out.println(f);        //.....,-128,-127,-126......,0,1,2,...127,128=-128,129=-127,130=-126,131=-125....
		System.out.println(l);
		System.out.println(c);
		System.out.println(b);
		System.out.println(w);
		
	}

}
