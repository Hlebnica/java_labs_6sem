import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App1 implements Runnable {
    //private static Map<Integer, String> map = Collections.synchronizedMap(new HashMap<Integer, String>());
    private static Map<Integer, String> map = new TreeMap<Integer, String>();
    private int threadNum;

    public App1(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {
        for (int i = 100 * threadNum; i < 100 * (threadNum + 1); i++) {
            map.put(i, "Value " + i);
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new App1(i));
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Map size: " + map.size());
    }
}