import java.util.Scanner;
import java.util.Stack;

public class App2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        Stack<Character> st = new Stack<>();
        boolean correct = true;
        for (int i = 0; i < s.length(); i++) {
            if (!correct)
                break;

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
                continue;
            }

            Character closingBracket = s.charAt(i);
            if (closingBracket == ']') {
                if (!st.empty() && st.peek() == '[')
                    st.pop();
                else
                    correct = false;
            }

            if (closingBracket == ')') {
                if (!st.empty() && st.peek() == '(')
                    st.pop();
                else
                    correct = false;
            }
            
            if (closingBracket == '}') {
                if (!st.empty() && st.peek() == '{')
                    st.pop();
                else
                    correct = false;
            }
        }

        if (!st.empty())
            correct = false;

        System.out.println(correct ? "yes" : "no");
    }
}