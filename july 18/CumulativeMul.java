import java.util.Scanner;



public class CumulativeMul {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        int res=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            arr[j]=res*arr[j];
            res=arr[j];
        }
        System.out.println("arrNum");
        for(int i=0;i<n;i++)
        {
        System.out.println(arr[i]);
        }
        sc.close();
    }
}
