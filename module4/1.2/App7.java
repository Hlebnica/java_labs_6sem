import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();

        int l = 0, r = 1000000007;
        while (r - l > 1) {
            int m = (r + l) / 2;

            int otr_cnt = 0;
            for (int i = 0; i < n; i++)
                otr_cnt += arr[i] / m;
            
            if (otr_cnt < k) 
                r = m;
            else
                l = m;
        }

        System.out.println(l);
    }
}
