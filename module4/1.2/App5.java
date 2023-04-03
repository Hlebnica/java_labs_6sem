import java.util.Scanner;

public class App5 {
    static double a, b, c, d;

    static double f(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        in.close();

        double r = 1;
        while(f(r) * f(-r) >= 0) r *= 2;
        double l = -r;
    
        while (r - l > 1e-6) {
          double m = (l + r) / 2;
          if (f(m) * f(r) > 0) 
            r = m;
          else
            l = m;
        }

        System.out.format("%.4f", l);
    }
}