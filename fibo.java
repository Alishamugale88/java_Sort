import java.util.*;
class fibo
{
  public static void main(String args[])
  {
   int a=0,b=1,c,i,n;
   System.out.println("ENTER NUMBER : ");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
    for(i=1;i<=n;i++)
     {
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
     }
   }
}