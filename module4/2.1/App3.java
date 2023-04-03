import java.util.Scanner;
import java.util.Stack;

public class App3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                continue;

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                st.push(s.charAt(i) - '0');
                continue;
            }

            int res = 0;
            int second = st.pop(), first = st.pop();
            if (s.charAt(i) == '+')
                res += first + second;

            if (s.charAt(i) == '-')
                res += first - second;

            if (s.charAt(i) == '*')
                res += first * second;
            
            st.push(res);
        }

        System.out.println(st.pop());
    }
}