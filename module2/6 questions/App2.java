public class App2 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    public abstract String eat();
}

class Dog extends Animal {
    public String eat() {
        return "Bone";
    }
}