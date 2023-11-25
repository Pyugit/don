package javapro2;

public class mixoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		a++;
		a++;
		int b=a++;//a=8 b=7
		
		
		b++;
		--b;
		int c=--b;//c=6 b=6
		
		--c;//5
		System.out.println("values are"+a+b+c);

	}

}
