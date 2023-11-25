package array;

public class practice {
    // main function
    public static void main(String args[])
    {
        //String s = "GeeksForGeeks";
        char g []  ={'k','l','o','m'}; // s.toCharArray();
        
        for (char aa:g)
        System.out.print(aa+" ");

        System.out.println();
        System.out.println("************");
 char[][]gfg  = {{'k','l'},{'o','m'}};// s.toCharArray();
        
        for(char a[] : gfg)
        {
        
         for(char f:a)
         System.out.print(f+" ");
         System.out.println();
        }   
    }
}