import java.util.Scanner;

public class KiemTraSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập một số từ bàn phím
        System.out.print("Nhap mot so nguyen: ");
        int so = scanner.nextInt();

        // Kiểm tra số âm, dương hay bằng 0
        if (so > 0) {
            System.out.println("So " + so + " la so duong.");
        } else if (so < 0) {
            System.out.println("So " + so + " la so am.");
        } else {
            System.out.println("So vua nhap bang 0.");
        }

        scanner.close();
    }
}
