public class App9 {
    public static void main(String[] args) {

    }
}

interface Weapon {
    public boolean isLetal = true;

    public void shoot();

    public void arm();
}

abstract class Artillery implements Weapon {

    public int damage;

    @Override
    public void arm() {
    }

    public void move() {};
}
