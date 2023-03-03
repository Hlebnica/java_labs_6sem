public class App2 {
    public static void main(String[] args) {
        
    }
}

abstract class Figure {
    public abstract String draw();
}

class Circle extends Figure {

    @Override
    public String draw() {
        return "draw_circle";
    }

}