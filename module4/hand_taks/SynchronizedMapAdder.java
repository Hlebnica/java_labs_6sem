import java.util.Map;
import java.util.TreeMap;

public class SynchronizedMapAdder implements Runnable {
    private final int THREAD_NUM;
    private final Map<Integer, String> synchronizedMap;
    private final TreeMap<Integer, String> treeMap;

    public SynchronizedMapAdder(int threadNum, Map<Integer, String> synchronizedMap, TreeMap<Integer, String> treeMap) {
        this.THREAD_NUM = threadNum;
        this.synchronizedMap = synchronizedMap;
        this.treeMap = treeMap;
    }

    @Override
    public void run() {
        for (int i = 100 * THREAD_NUM; i < 100 * (THREAD_NUM + 1); i++) {
            synchronized (synchronizedMap) {
                synchronizedMap.put(i, "value" + i);
            }
            treeMap.put(i, "value" + i);
        }
    }
}