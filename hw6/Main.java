import basics.Matrix;

public class Main {
    public static void main(String[] args) {
        double[][] arr = new double[5][3];
        arr[0][2] = 3;
        arr[0][1] = 1;
        arr[2][0] = 9;
        arr[4][1] = 4;
        arr[3][2] = 2;

        double[][] arr1 = new double[5][3];
        arr1[0][0] = 23;
        arr1[0][2] = 2;
        arr1[0][1] = 4;
        arr1[2][0] = 7;
        arr1[4][1] = 14;
        arr1[3][2] = 22;

        Matrix m = new Matrix(5, 3, arr);
        Matrix m1 = new Matrix(5, 3, arr1);
        System.out.println("Matrix 1:\n" + m.toString());
        System.out.println("Matrix 2:\n" + m1.toString());

        System.out.println("Sum of two Matrices:\n"+ m.sum(m, m1));
        System.out.println("Difference of two matrices:\n" + m.difference(m, m1));        
        System.out.println("Sorted by rows:\n" + m.sorted_by_rows(m));
        System.out.println("Identity by N,N:\n" + m.identity(m));
        System.out.println("Transpose:\n" + m.transpose(m));
        System.out.println("Zero:\n" + m.zero(m));
    }
}