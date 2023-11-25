package array;

public class object2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[][]= {{1,2.3f},{"hg",'h'},{26466331896165d,16556232151l}};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
//				System.out.println(a[0][0]+"  "+a[0][1]);
//				System.out.println();
//		
				for(int i=0;i<a.length;i++ )
		{
			for(int j=0;j<a[i].length;j++ )
				System.out.println(a[i][j]);
	}
		
	}
}
