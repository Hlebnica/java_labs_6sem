public class App4 {
    public static void binFraction(double x, int n) {
        while (n != 0) {
            x *= 2;
            int whole = (int) x / 1;
            System.out.print(whole);
            x -= whole;
            n--;
        }
    }
}
