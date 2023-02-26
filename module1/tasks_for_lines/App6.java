import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        char targetChar = '\0';
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] == 2) {
                targetChar = (char) (i + 'a');
                break;
            }
        }
        System.out.println(targetChar);
        in.close();
    }
}
