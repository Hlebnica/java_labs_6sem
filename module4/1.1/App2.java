import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void array_list_print(ArrayList<Integer> array_list)
    {
        for (int i = 0; i < array_list.size(); i++)
        {
            System.out.print(array_list.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            array_list.add(input.nextInt());
        }
        input.close();

        array_list.add(0, array_list.get(array_list.size() - 1));
        array_list.remove(array_list.size() - 1);

        array_list_print(array_list);
    }
}
