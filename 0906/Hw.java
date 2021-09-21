public class Hw {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("factorial of " + num + " is:" + fact(num));
    }
}
