import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    int i,n,c,s=0,rem=0;
    System.out.println("ENTER NUMBER : ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    while(n>0)
    {
      rem=n%10;
      s=rem+(s*10);
      n=n/10;
    }
    if(s==c)
    {
      System.out.println(c+"  PALINDROME NUMBER");
    }
    else
    {
      System.out.println(c+"  NOT PALINDROME NUMBER");
    }
  }
}