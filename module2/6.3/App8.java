public class App8 {
    public static void main(String[] args) {
        
    }
}

abstract class Live {
    public String name;
    public final void feed() {}
    public abstract void reproduction();
}

class Animal extends Live {
    public void reproduction() {}
    public void move() {}
}
