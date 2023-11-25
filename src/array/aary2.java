package array;

public class aary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a[] =new int[2][3];
		a[0][0]=10;//row 0 1 2  col 01
		a[0][1]=11;
		a[0][2]=12;
		a[1][0]=13;
		a[1][1]=14;
		a[1][2]=15;
		
		System.out.print(a.length);
		System.out.println(a[0].length);
		
		System.out.println();
		
		for(int i=0;i<a.length;i++ )
		{
			for(int j=0;j<a[0].length;j++ )
				System.out.println(a[i][j]);
	}

}
	}
