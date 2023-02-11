import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        if (((a == 0) && (b < 0) || (a < 0) && (b < 0)) || (a == b && b == 0)) {
            System.out.println("no such x");
        } else {
            if (((-b / a < 0) && (a > 0)) || ((a == 0) && (b > 0))) {
                System.out.println("any x");
            } else {
                if (((a > 0) && (0 > -b / a)) || ((a > 0) && (0 < -b / a))) {
                    double k = -b / a;
                    System.out.print("x<");
                    System.out.printf("%.1f", -k);
                    System.out.print(" or x>");
                    System.out.printf("%.1f", k);
                }
            }
            if ((a < 0) && (0 < -b / a)) {
                double k = -b / a;
                System.out.printf("%.1f", -k);
                System.out.print("<x<");
                System.out.printf("%.1f", k);
            }
            in.close();
        }

    }
}