import java.util.*;

class Factorial
{
 public static void main(String args[])
 {
   int fact=1,n,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER NUMBER TO CALCULATE FACTORIAL : "); 
   n=sc.nextInt();
   for(i=1;i<=n;i++)
   {
     fact=fact*i;
   }
  System.out.println("FACTORIAL OF " +n+" : "+fact);
 }
}
