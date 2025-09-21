import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }
        System.out.println("Danh sách hiện tại: " + list);
        System.out.print("Nhập vị trí cần thêm: ");
        int addIndex = scanner.nextInt();
        System.out.print("Nhập giá trị cần thêm: ");
        int valueToAdd = scanner.nextInt();
        if (addIndex >= 0 && addIndex <= list.size()) {
            list.add(addIndex, valueToAdd);
            System.out.println("Danh sách sau khi thêm: " + list);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
        System.out.print("Nhập vị trí cần xóa: ");
        int removeIndex = scanner.nextInt();
        if (removeIndex >= 0 && removeIndex < list.size()) {
            list.remove(removeIndex);
            System.out.println("Danh sách sau khi xóa: " + list);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
}