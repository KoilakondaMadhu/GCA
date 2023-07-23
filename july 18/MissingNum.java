import java.util.Scanner;

public class MissingNum
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int last=arr[n-1];
        int j=0;
        System.out.println("array num ");
        for(int k=1;k<=last;k++)
        {
            if(arr[j]!=k)
            {
                System.out.print(k+",");
            }
            else
            j++;
        }
    }
}
