import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0, y = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] parts = line.split(" ");

            String direction = parts[0];
            int steps = Integer.parseInt(parts[1]);

            switch (direction) {
                case "North":
                    y += steps;
                    break;
                case "South":
                    y -= steps;
                    break;
                case "East":
                    x += steps;
                    break;
                case "West":
                    x -= steps;
                    break;
                default:
                    break;
            }
        }

        System.out.println(x + " " + y);
        in.close();
    }
}
