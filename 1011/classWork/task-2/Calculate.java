public class Calculate {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("less than or more than 2 arguments!!! Need 2 arguments!!!!!");
        } else {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            System.out.println("a+b: " + (a+b));
            System.out.println("a-b: " + (a-b));
            System.out.println("a*b: " + (a*b));

            if (b == 0) {
                throw new ArithmeticException("Dividing by zero!!!");
            }else {
                System.out.println("a/b: " + (a/b));
            }
            System.out.println("a%b: " + (a%b));
        }
    }
}