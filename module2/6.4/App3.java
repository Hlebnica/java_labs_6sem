public class App3 {
    public static void main(String[] args) {
        
    }    
}

abstract class Animal {
    public abstract String speak();
}

class Cat extends Animal {
    public String speak() {
        return "Miy";
    }
}

class Dog extends Animal {
    public String speak() {
        return "Gav";
    }
}