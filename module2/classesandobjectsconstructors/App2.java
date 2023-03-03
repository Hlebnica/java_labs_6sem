public class App2 {
    public static void main(String[] args) {
        SQEquation f = new SQEquation (1, 2, 1);
        System.out.println("f(5) = " + f.val(5));
    }    
}

class SQEquation {
    public int a;
    public int b;
    public int c;

    public SQEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    } 

    public int val(int x) {
        return this.a * x * x + b * x + c;
    }
}
