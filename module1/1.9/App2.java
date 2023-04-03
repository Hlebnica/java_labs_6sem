import java.util.Scanner;

public class App2 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static int sumOfSeven(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i >= 10 && i <= 99 && i % 7 == 0) {
                sum += sumOfDigits(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        in.close();

        System.out.println(sumOfSeven(a, b));
    }
}
