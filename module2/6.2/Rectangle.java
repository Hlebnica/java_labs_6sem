public class Rectangle extends Figure implements Moveable {

    private float height;
    private float width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return height * width;
    }

    @Override
    public float getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void move(float dx, float dy) {
        super.setX(super.getX() + dx);
        super.setY(super.getY() + dy);
    }

    @Override
    public void resize(float koeff) {
        this.height *= koeff;
        this.width *= koeff;
    }

    public String toString() {
        return String.format("Rectangle\nCenter: %s\nHeight: %.1f\nWidth: %.1f", this.getCenter(), this.height, this.width);
    }

    private String getCenter() {
        return String.format("(%.1f, %.1f)", super.getX() + this.width / 2, super.getY() + this.height / 2);
    } 
}
