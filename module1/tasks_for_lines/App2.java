import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        System.out.println(changeCase(c));
        in.close();
    }
    public static char changeCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 32);
        } else if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        } else {
            return c;
        }
    }
}
