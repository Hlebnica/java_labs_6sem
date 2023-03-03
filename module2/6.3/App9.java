public class App9 {
    public static void main(String[] args) {
        
    }
}

abstract class Vegetable {
    public String name;
    public final void cultivate() {}
    public abstract void harvest();
}

class Potato extends Vegetable {
    public void harvest() {}
    public void debug() {}
}
