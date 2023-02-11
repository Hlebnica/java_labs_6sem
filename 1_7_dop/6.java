import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str = Integer.toString(N);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        in.close();
    }
}