import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Import elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0, mostFreq = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mostFreq = arr[i];
            }
        }
        System.out.println("Elements appear the most: " + mostFreq + " (Appear " + maxCount + " times)");
    }
}
