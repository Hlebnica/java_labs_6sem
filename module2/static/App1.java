public class App1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        Printer.print(a);
    }
}

class Printer {
    public static void print(int x) {
        System.out.println(x);
    }

    public static void print(Double x) {
        System.out.println(x);
    }

    public static void print(int[] x) {
        String res = "[";
        boolean f = true;
        for (int i : x) {
            res += f ? i : "," + i;

            if (f) {
                f = !f;
            }
        }
        res += ']';

        System.out.println(res);
    }

    public static void print(double[] x) {
        String res = "[";
        boolean f = true;
        for (double i : x) {
            res += f ? i : "," + i;

            if (f) {
                f = !f;
            }
        }
        res += ']';

        System.out.println(res);
    }
}