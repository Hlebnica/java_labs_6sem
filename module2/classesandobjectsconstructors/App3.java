public class App3 {
    public static void main(String[] args) {

    }
}

class A {
    B b;

    A() {
        System.out.print("AB");
        b = new B();
    }

    A(int k) {
        b = new B(0);
        System.out.print("Ai");
    }

    A(B b) {
        System.out.println("Ab");
    }
}

class B {
    B() {
        System.out.print("B");
    }

    B(int k) {
        System.out.print("Bi");
    }
}
