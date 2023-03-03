public class App6 {
    public static void main(String[] args) {
        
    }    
}

interface Animal {
    public String speak();
}

class Cat implements Animal {
    public String speak() {
        return "Miy";
    }
}

class Dog implements Animal {
    public String speak() {
        return "Gav";
    }
}
