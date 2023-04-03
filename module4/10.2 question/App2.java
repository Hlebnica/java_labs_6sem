import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Set<Character>> fileAccess = new HashMap<>(); // файл и доступы
        for (int i = 0; i < n; i++) {
            String fileName = sc.next();
            Set<Character> access = new HashSet<>();
            while (sc.hasNext(" ") || sc.hasNext("R") || sc.hasNext("X") || sc.hasNext("W")) {
                Character a = sc.next().charAt(0);
                if (a.equals(" ")) {
                    continue;
                }
                access.add(a);
            }
            fileAccess.put(fileName, access);
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            Character action = Character.toUpperCase(sc.next().charAt(0));
            if (action == 'E')
                action = 'X';
            String fileName = sc.next();
            Set<Character> access = fileAccess.get(fileName);
            if (access.contains(action)) {
                System.out.println("OK");
            } else {
                System.out.println("Access denied");
            }
        }
        sc.close();
    }
}