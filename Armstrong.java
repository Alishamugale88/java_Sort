import java.util.*;
class Armstrong
{
 public static void main(String args[])
 {
  int n,r,arm=0,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER NUMBER : ");
  n=sc.nextInt();
  c=n;
  while(n>0)
  {
    r=n%10;
    arm=arm+(r*r*r);
    n=n/10;
  }
  if(c==arm)
  {
     System.out.println(c+" IS ARMSTRONG NUMBER "); 
  }
  else
  {
    System.out.println(c+" IS NOT ARMSTRONG NUMBER ");
  }
 }
}