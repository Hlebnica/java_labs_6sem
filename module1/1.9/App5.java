public class App5 {
    public static double avgOf4Digit(int[] arr) {
        double sum = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1000 && arr[i] <= 9999) {
                sum += arr[i];
                cnt++;
            }
        }

        if (cnt == 0) {
            return -1;
        } else {
            return sum / cnt;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
