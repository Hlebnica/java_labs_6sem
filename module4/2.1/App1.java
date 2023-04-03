import java.util.LinkedList;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(in.nextInt());
        in.close();
        
        int ans = 0;
        while (true) {
            if (list.size() == 0)
                break;

            int cnt = 1;
            int prev = list.get(0);
            int l = 0, r = -1;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) == prev) {
                    cnt++;
                    if (cnt >= 3) {
                        r = i;
                    }
                } else {

                    if (r != -1)
                        break;
                    
                    cnt = 1;
                    prev = list.get(i);
                    l = i;
                    r = -1;
                }
            }

            if (r == -1) 
                break;

            ans += r - l + 1;
            for (int i = l; i <= r; i++)
                list.remove(l); 
        }
        System.out.println(ans);
    }
}