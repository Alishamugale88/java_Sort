import java.util.Scanner;
class pattern
{
  public static void main(String args[])
  {
    int i,j,rows;
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER NO OF ROWS : ");
     rows=s.nextInt();
    for(i=rows;i>=0;i--)
    {
       for(j=i;j<=rows;j++)
       {
          System.out.print("*");
       }
      System.out.println();
    }
  }
}