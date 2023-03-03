import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));

        System.out.println(x <= Byte.MAX_VALUE && x >= Byte.MIN_VALUE ? "YES" : "NO");
        System.out.println(x <= Short.MAX_VALUE && x >= Short.MIN_VALUE ? "YES" : "NO");
    }
}
