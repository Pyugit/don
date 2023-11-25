
public class arry {

	public static void main(String[] args) {
		System.out.println("//1");
//1		
		
		char[] a=new char [5];
//		char a[] =new char [2]; //ok
			
		a[0]='o';
//		a[1]=113;
//		a[2]=113;
//		a[3]=211;
		a[4]=151;
//		a[5]=116;
		
		for(int i=0;a.length>i;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		System.out.println("//2");
//2		
		int d[]= {1,5,6,7,6,};
		System.out.println(d.length);

		for(int i=0;a.length>i;i++)
		{
			System.out.print(d[i]+" kl  ");
		}
		System.out.println();

		System.out.println("//3");
//3
		
int[][] b= {{1,2,3,},{4,6},{5,2,8},{},{,},{5,0,1,4,}, };

b[1][1]=5;
		for(int i=0;b.length>i;i++)
		{
			 for(int j=0;b[i].length>j;j++)
			 {
			System.out.print(b[i][j]+" "+b[i].length+"len"+b.length+"_____");
		
			 }
			 System.out.println();
		}
	
 System.out.println();

	System.out.println("//4");
//4 
 
				float[][] b1= new float[3][3];

				b1[0][0]=5;
			//	b1[0][1]=7;
			//	b1[0][2]=5;
				b1[1][0]=5;
				b1[1][1]=9;
		   //   b1[1][1]=6;
				b1[2][1]=6;
				
				
				for(int i=0;b1.length>i;i++)
				{
					 for(int j=0;b1[i].length>j;j++)
					 {
					System.out.print(b1[i][j]+" "+b1[i].length+"len  ");
				
					 }
					 System.out.println();
				}
				
				System.out.println("//5");
//5
				String[]f = {"don","jk","lk"};
				char[]g = {'s','k','m','i'};
				Object[]g1 = {'s','k','m','i',"jkiu",true,5,5.3333,g[1],};
				
				for(int i=0;f.length>i;i++)
				{
					System.out.print(f[i]+" ");
				}
				
				System.out.println();
				
				
				for(int i=0;g.length>i;i++)
				{
					System.out.print(g[i]+" ");
				}
				
				System.out.println();
				
				
				for(int i=0;g1.length>i;i++)
				{
					System.out.print(g1[i]+" ");
				}
	}

}
