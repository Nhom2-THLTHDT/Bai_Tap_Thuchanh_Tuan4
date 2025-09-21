import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap cac so nguyen (cach nhau bang dau cach):");
        String line = sc.nextLine();

        String[] parts = line.trim().split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();

        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }

        System.out.println("Cac phan tu trong danh sach la:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
