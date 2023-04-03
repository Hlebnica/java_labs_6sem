import java.util.HashSet;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        HashSet <Integer> data = new HashSet<>();
        for (int i = 0; i < n; i++)
            data.add(in.nextInt());
        in.close();

        System.out.println(data.size());
    }
}
