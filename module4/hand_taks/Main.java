import java.util.*;

public class Main {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("4.6.1");
        // 4.6.1
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < 10; i++){
            long fibNumber = fibonacci.getFibonacci(i);
            System.out.printf("Число Фибоначи для числа %d = %d\n", i, fibNumber);
        }

        System.out.println("\n\n4.7.1");
        // 4.7.1
        int passGrade = 80;
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 85));
        students.add(new Student("David", 70));
        students.add(new Student("Eve", 95));

        System.out.printf("Студенты чьи проходные баллы выше чем %d:\n", passGrade);
        for (Student student : students) {
            if (student.getGrade() >= passGrade) {
                System.out.printf("%s: %d\n", student.getName(), student.getGrade());
            }
        }

        System.out.println("\n\n4.8.1");
        // 4.8.1
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        Integer[] unsortedArray = {1, 4, 2, 5, 3};
        String[] test = {"abc", "aboba", "bcd" };

        System.out.println(IsSorted.isSorted(sortedArray));
        System.out.println(IsSorted.isSorted(unsortedArray));
        System.out.println(IsSorted.isSorted(test));


        System.out.println("\n\n4.10.1");
        // 4.10.1
        /*
        * synchronizedMap для безопасного многопоточного доступа к общей коллекции.
        * Если использовать обычный TreeMap, то возможны гонки данных, поскольку
        * TreeMap не является потокобезопасной коллекцией.
        * */
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new SynchronizedMapAdder(i, synchronizedMap, treeMap));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Размер synchronized map: " + synchronizedMap.size());
        System.out.println("Размер tree map: " + treeMap.size());

    }
}