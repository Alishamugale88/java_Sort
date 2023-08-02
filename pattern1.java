import java.util.Scanner;
class pattern1
{
  public static void main(String args[])
  {
   
    int rows,i,j,s;
    System.out.println("ENTER ROWS:");
    Scanner sc=new Scanner(System.in);
    rows=sc.nextInt();

   for(i=1;i<=rows;i++)
   {
     for(s=1;s<=(rows-i);s++)
      {
        System.out.print(" ");
      }
        for(j=1;j<=(2*i-1);j++)
        {
         System.out.print("*");
        }
     System.out.println();
   }

   for(i=rows-1;i>=1;i--)
   {
     for(s=1;s<=(rows-i);s++)
      {
        System.out.print(" ");
      }
        for(j=1;j<=(2*i-1);j++)
        {
         System.out.print("*");
        }
     System.out.println();
   }
  }
}