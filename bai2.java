import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = sc.nextInt();
        System.out.print("Input B: ");
        int b = sc.nextInt();
        System.out.print("Input C: ");
        int c = sc.nextInt();
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Min number: " + min);
    }
}
