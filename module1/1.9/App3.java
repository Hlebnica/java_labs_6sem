import java.util.Scanner;

public class App3 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static int sumOfThirteen(int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (sumOfDigits(i) % 13 == 0) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        System.out.println(sumOfThirteen(n));
    }
}
