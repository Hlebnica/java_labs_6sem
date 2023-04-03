import java.util.Scanner;
import java.util.TreeMap;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> purchases = new TreeMap<>();

        while (scanner.hasNext()) {
            String buyer = scanner.next();
            String product = scanner.next();
            int quantity = scanner.nextInt();

            purchases.computeIfAbsent(buyer, k -> new TreeMap<>());
            purchases.get(buyer).merge(product, quantity, Integer::sum);
        }

        for (String buyer : purchases.keySet()) {
            System.out.println(buyer + ":");
            for (String product : purchases.get(buyer).keySet()) {
                System.out.println(product + " " + purchases.get(buyer).get(product));
            }
        }

        scanner.close();
    }
}