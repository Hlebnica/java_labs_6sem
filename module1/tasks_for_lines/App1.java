import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if (isDigit(c)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        in.close();
    }
    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }
}
