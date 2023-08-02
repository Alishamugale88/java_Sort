import java.util.*;
class Anagram
{
 public static void main(String args[])
 {
   String s1,s2;
   int i,j,flag=0,temp=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER STRING S1 : ");
   s1=sc.nextLine();
   System.out.println("ENTER STRING S2 : ");
   s2=sc.nextLine();

    for(i=0;s1[i]!='\0';i++)
    {
      len++;
    }

    for(i=0;i<len;i++)
     {
      for(j=i+1;j<len;j++)
      {
        if(s1[i]>s1[j])
        {
         temp=s1[i];
         s1[i]=s1[j];
         s1[j]=temp;
        }
       if(s2[i]>s2[j])
        {
         temp=s2[i];
         s2[i]=s2[j];
         s2[j]=temp;
        }
     }
    }
   for(i=0;i<len;i++)
     {
      if(s1[i]!=s2[i])
      {
         System.out.println("STRING IS NOT ANAGRAM");
         flag=1;
         break;
      }
    }
    if(flag==0)
    {
     System.out.println(s1+"STRING IS ANAGRAM");
    }
 }
}