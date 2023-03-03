public class App6 {
    public static void main(String[] args) {
        
    }
}

interface Runnable {
    public void run();
}

class MyClass implements Runnable {
    public boolean running;

    @Override
    public void run() {
    }

    public void start() {}

    public void stop() {}

}