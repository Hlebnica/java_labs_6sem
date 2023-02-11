import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0 && n < 10) {
            System.out.println("DIGIT");
        } else if (n >= 10 && n < 100) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
        in.close();
    }
    
}