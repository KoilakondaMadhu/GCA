import java.util.Arrays;
import java.util.Scanner;



public class CountSingularOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array = ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		System.out.println();
		System.out.println("Count of Singular socks =  "+countSingularSocks(arr,n));
		}
		public static int countSingularSocks(int[] arr,int n) {

		        Arrays.sort(arr);

		        int singularCount = 0;
		        int sockId = arr[0];
		        int currentCount = 1;

		        for (int i = 1; i < n; i++) {
		            if (arr[i] == sockId) {
		                currentCount++;
		            } else {
		                if (currentCount >= 1 && currentCount % 2 != 0) {
		                    singularCount++;
		                    }
		               
		                currentCount = 1;
		            }
		            sockId = arr[i];
                }
		        if (currentCount == 1 || currentCount % 2 != 0) {
		            singularCount++;
		        }

		        return singularCount;
		    }
	}
