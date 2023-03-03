public class App1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 5);
        System.out.println("S = " + rect.getS());
    }
}

class Rectangle {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getS() {
        return this.a * this.b;
    }

    public int getP() {
        return 2 * (this.a + this.b);
    }
}
