import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String ending;
        if (n % 10 == 1 && n % 100 != 11) {
            ending = "";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            ending = "A";
        } else {
            ending = "OV";
        }

        System.out.println(n + " TORT" + ending);
        in.close();
    }

}