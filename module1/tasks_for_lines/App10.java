import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = s.replaceAll("\\s+", " ");
        System.out.println(result);
        in.close();
    }
}
