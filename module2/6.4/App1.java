public class App1 {

    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.speak());
    }

}

abstract class Animal {
    public abstract String speak();
}

class Cat extends Animal {

    @Override
    public String speak() {
        return "Meow";
    }

}