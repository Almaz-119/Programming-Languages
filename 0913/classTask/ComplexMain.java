class ComplexMain {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.re = 3;
        num1.im = 2; //3+2i

        Complex num2 = new Complex();
        num2.re = 1;
        num2.im = 2;

        System.out.println("abs(3+2i) = "+ num1.abs());
        System.out.println("abs(1+2i) = "+ num2.abs());

        // 1St classwork, finish main class, by testing other methods!
        
        num1.add(num2);
        System.out.println("(3+2i) + (1+2i) = "+ num1.abs());
        num1.sub(num2);
        System.out.println("(3+2i) - (1+2i) = "+ num1.abs());
        num1.mult(num2);
        System.out.println("(3+2i) * (1+2i) = "+ num1.abs());
    }
}