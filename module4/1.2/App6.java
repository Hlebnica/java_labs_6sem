import java.util.Scanner;

public class App6 {
    public static boolean ok(int[] arr, int k, int dist) {
        int cur = arr[0];
        k--;

        int idx = 1;
        while (k > 0) {
            int l = idx, r = arr.length;

            while (r - l > 1) {
                int m = (r + l) / 2;

                if (arr[m] > cur + dist) 
                    r = m;
                else
                    l = m;
            }

            if (l >= 0 && arr[l] >= cur + dist) {
                cur = arr[l];
                idx = l;
            } else if (r < arr.length && arr[r] >= cur + dist) {
                cur = arr[r];
                idx = r;
            } else {
                return false;
            }

            k--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] st = new int[n];
        for (int i = 0; i < n; i++)
            st[i] = in.nextInt();
        in.close();
        
        int l = 0, r = st[n - 1] + 1;
        while (r - l > 1) {
            int m = (r + l) / 2;

            if (ok(st, k, m)) 
                l = m;
            else
                r = m;
        }  

        System.out.println(l);
    }
}