import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        in.close();
    }

}