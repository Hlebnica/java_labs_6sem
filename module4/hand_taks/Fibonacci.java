import java.util.ArrayList;

public class Fibonacci {
    private final ArrayList<Long> fibList;

    public Fibonacci() {
        fibList = new ArrayList<>();
        fibList.add(0L); // начальное значение Фибоначчи
        fibList.add(1L);
    }

    public long getFibonacci(int n) {
        if (n < fibList.size()) {
            return fibList.get(n); // если значение уже было вычислено, то возвращаем его
        }

        // добавляем новые значения Фибоначчи в список
        for (int i = fibList.size(); i <= n; i++) {
            long fibNumber = fibList.get(i - 1) + fibList.get(i - 2);
            fibList.add(fibNumber);
        }

        return fibList.get(n); // возвращаем значение Фибоначчи для n
    }
}
