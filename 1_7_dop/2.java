import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, result = 0;
        a = in.nextInt();
        b = in.nextInt();
        for (int i = 0; i < Math.abs(b); i++) {
            result += Math.abs(a);
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            result = -result;
        }
        System.out.println(result);
    }
}