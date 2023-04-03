import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] arr1 = new int[n], arr2 = new int[k];
        for (int i = 0; i < n; i++)
            arr1[i] = in.nextInt();
        for (int i = 0; i < k; i++)
            arr2[i] = in.nextInt();
        in.close();

        for (int i = 0; i < k; i++) {
            int l = 0, r = n;
            while (r - l > 1) {
                int m = (r + l) / 2;

                if (arr2[i] >= arr1[m]) {
                    l = m;
                } else {
                    r = m;
                }
            }

            if (arr1[l] == arr2[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}