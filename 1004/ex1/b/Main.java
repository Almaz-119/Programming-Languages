package b;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter N: ");
        int N = Integer.parseInt(System.console().readLine());

        double[] arr = new double[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + "th item: ");
            arr[i] = Double.parseDouble(System.console().readLine());
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            sum += arr[i];
        }
        double average = sum / arr.length;

        double[] diff_from_avg = {0,0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            diff_from_avg[i] = Math.abs(average - arr[i]);
        }
        
        int min_idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (diff_from_avg[i] < diff_from_avg[min_idx]) {
                min_idx = i;
            }
        }
        System.out.println("Average: " + average + "closest to average: "
         + arr[min_idx] + " index: " + min_idx);
    }
}