import java.util.Scanner;

class mainclass
{
    public static void main(String agrs[])
    {
        int fact=1,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
           fact=fact*i;
        }
        System.out.println("Factorial : ",fact);
    }
}