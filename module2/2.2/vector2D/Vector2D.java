package vector2D;
import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public static int count = 0;

    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D vector2d) {
        this.vX = vector2d.vX;
        this.vY = vector2d.vY;
        count++;
    }

    public String toString() {
        return String.format(Locale.US, "(%.2f, %.2f)", this.vX, this.vY);
    }

    public void print() {
        System.out.println(this.toString());
    }

    public double length() {
        return Math.sqrt(vX*vX + vY*vY);
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized() {
        double length = this.length();
        this.vX /= length; 
        this.vY /= length;
    }

    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }
}
