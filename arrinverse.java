import java.util.*;
class arrinverse
{
  public static void main(String args[])
  {
   int i,j,n;
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER ARRAY SIZE " );
   n=sc.nextInt();
   int a[][]=new int [10][10];
   
   System.out.println("ENTER "+n+"ARRAY ELEMENTS");
    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
       a[i][j]=sc.nextInt();
     }
    }
   
  System.out.println("ARRAY ELEMENTS ARE : ");
    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
       System.out.print(a[i][j]+" ");
     }
     System.out.println();
    }
   
   System.out.println("INVERSE OF ARRAY  : ");
    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
       System.out.print(a[j][i]+" ");
     }
     System.out.println();
    }
  }
}
    