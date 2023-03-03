import java.util.ArrayList;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            array_list.add(input.nextInt());
        }
        input.close();

        int count = 0;

        for (int i = 1; i < array_list.size(); i++)
        {
            if (array_list.get(i) > array_list.get(i - 1))
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
