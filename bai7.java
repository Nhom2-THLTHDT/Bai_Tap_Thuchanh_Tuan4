import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;

        System.out.print("Nhap so phan tu: ");
        n = sc.nextInt();

        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu mang[" + i + "]: ");
            mang[i] = sc.nextInt();
            tong += mang[i];
        }

        System.out.println("Tong cac phan tu = " + tong);
    }
}
