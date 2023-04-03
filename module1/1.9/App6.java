import java.util.Scanner;

public class App6 {
    public static void minToBegin (int[] arr) {
        int minEl = arr[0], minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minEl) {
                minEl = arr[i];
                minIdx = i;
            }
        }

        int[] newArr = new int[arr.length];
        newArr[0] = minEl;
        int newArrIdx = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIdx) {
                newArr[newArrIdx] = arr[i];
                newArrIdx++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        minToBegin(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
