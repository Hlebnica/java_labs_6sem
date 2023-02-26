import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String str = s.replaceAll(" ", "");
        str = str.toLowerCase();
        int length = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        in.close();
    }
}
