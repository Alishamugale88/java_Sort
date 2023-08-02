import java.util.*;

public class array2
{
    public static void main(String args[])
    {
        int n,i;

        Scanner sc=new Scanner(System.in);

        int a[]=new int[100];
        
        System.out.println("Enter size of array : ");
        n=sc.nextInt();

        System.out.println("Enter elements of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        //using sort function
       /* System.out.println("Before sorted array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("sorted array : "+Arrays.toString(a));*/
        
        //without using sort function
        for(i=0;i<n;i++)
        {
           for(int j=i;j<n;j++)
           {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
           }
        }
        System.out.println("Sorted Array " );
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


        System.out.println("first Smallest element : "+a[0]);
        System.out.println("Second Smallest element : "+a[1]);

        System.out.println("first Largest element : "+a[n-1]);
        System.out.println("Second largest element : "+a[n-2]);

    }
}