import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input 
        from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i =0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int k = 0;
        int sum =0;
        for (int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                sum += a[j];
                if(sum < 0){
                    k++;
                }
            }
            sum =0;
        }
        System.out.println(k);
    }
}
