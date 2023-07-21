importjava.util.Scanner*;

public class Subarry {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++) arr[i] = scanner.nextInt();
        int ct = 0;
        for(int i =0;i < n ; i++){
            int sum =0;
            for(int k = i;k< n;k++){
                sum = sum + arr[j];
                if(sum < 0) ct += 1;

            }
        }
    }
    
}
