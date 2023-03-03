abstract class Figure {
    private float x;
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    private float y;

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
}