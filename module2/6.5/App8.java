public class App8 {
    public static void main(String[] args) {

    }
}

interface Unknowable {
    public boolean isNotknown = true;

    public void set(Number number);

    public void delete();
}

abstract class MyKnow implements Unknowable {
    public String name;

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

    public void print() {
    }

}