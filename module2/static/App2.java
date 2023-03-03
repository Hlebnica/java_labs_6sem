public class App2 {
    public static void main(String[] args) {
        A.a = 0;
    }
}

class A {
    static {
        System.out.println("Hello world!");
    }
    public static int a;
}