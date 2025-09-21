import java.util.Scanner;
public class Bai6
{
    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();
        System.out.println("UCLN = " + gcd(a, b));
        System.out.println("BCNN = " + lcm(a, b));
    }
}
