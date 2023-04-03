import java.util.Scanner;

public class App2 {
    public static int lower_bound(int[] arr, int req) {
        int l = -1, r = arr.length;
        while (r - l > 1) {
            int m = (r + l) / 2;

            if (arr[m] >= req) {
                r = m;
            } else {
                l = m;
            }
        }
        
        return (r < arr.length && arr[r] == req) ? r + 1 : -1;
    }

    public static int upper_bound(int[] arr, int req) {
        int l = -1, r = arr.length;
        while (r - l > 1) {
            int m = (r + l) / 2;

            if (arr[m] > req) {
                r = m;
            } else {
                l = m;
            }
        }
        
        return (l > -1 && arr[l] == req) ? l + 1 : -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] data = new int[n], requests = new int[m];
        for (int i = 0; i < n; i++)
            data[i] = in.nextInt();
        for (int i = 0; i < m; i++)
            requests[i] = in.nextInt();
        in.close();

        for (int i = 0; i < m; i++) {
            int lb = lower_bound(data, requests[i]), ub = upper_bound(data, requests[i]);
            
            if (lb == -1 || ub == -1) {
                System.out.println(0);
                continue;
            }

            System.out.println(lb + " " + ub);
        }
    }
}