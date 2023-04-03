import java.util.HashSet;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("#")) {
            String[] parts = line.split(" ");
            String operation = parts[0];
            String value = parts[1];

            if (operation.equals("+"))
                set.add(value);
            else if (operation.equals("?"))
                System.out.println(set.contains(value) ? "YES" : "NO");

            line = scanner.nextLine();
        }

        scanner.close();
    }
}
