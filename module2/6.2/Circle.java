public class Circle extends Figure implements Moveable {

    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * (float) Math.PI * radius;
    }

    @Override
    public void move(float dx, float dy) {
        super.setX(super.getX() + dx);
        super.setY(super.getY() + dy);
    }

    @Override
    public void resize(float koeff) {
        this.radius *= koeff;
    }

    public String toString() {
        return String.format("Circle\nCenter: (%.1f, %.1f)\nRadius: %.1f", super.getX(), super.getY(), this.radius);
    }

}
