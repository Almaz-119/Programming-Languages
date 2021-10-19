import utils.DoubleVector;

public class Main {
    public static void main(String[] args) {
        double[] d1 = {1.0,2.0,3.0};
        double[] d2 = {4.0,1.0,5.0};

        DoubleVector db1 = new DoubleVector(d1);
        System.out.println("First: " + db1);
        DoubleVector db2 = new DoubleVector(d2);
        System.out.println("Second: " + db2);
        
        System.out.println();

        db1.difference(db2);
        System.out.println("Difference: " + db1);
        db1.sum(db2);
        System.out.println("Sum: " + db1);
        db1.product(db2);
        System.out.println("Product: " + db1);
    }
}