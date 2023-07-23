import java.util.*;

public class Main {
    public static int maxUniqueIntegers(int[] arr, int k) {
        int maxUnique = 0;
        Set<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove the first element of the window when it slides out of the window
            if (i >= k) {
                uniqueElements.remove(arr[i - k]);
            }
            // Add the current element to the window
            uniqueElements.add(arr[i]);

            // Update the maximum number of unique elements seen so far
            maxUnique = Math.max(maxUnique, uniqueElements.size());
        }

        return maxUnique;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxUniqueIntegers(arr, k));
    }
}
