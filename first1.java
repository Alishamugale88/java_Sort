import java.util.Scanner;

public class array2
{
    public static void main(String args[])
    {
        int n,i;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}