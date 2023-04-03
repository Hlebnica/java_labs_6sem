public class App1 {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sortedArr = { 1, 2, 3, 4, 5 };
        int[] unsortedArr = { 3, 2, 1 };

        if (isSorted(sortedArr))
            System.out.println("Массив отсортирован");
        else
            System.out.println("Массив не отсортирован");

        if (isSorted(unsortedArr))
            System.out.println("Массив отсортирован");
        else
            System.out.println("Массив не отсортирован");
    }
}