import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encryptedText = in.nextLine();
        int k = in.nextInt();
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c -= k % 26;
                if (c < 'A') {
                    c += 26;
                }
            }
            decryptedText.append(c);
        }
        System.out.println(decryptedText);
        in.close();
    }
}
