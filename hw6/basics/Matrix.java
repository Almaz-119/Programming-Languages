package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    int M;
    int N;
    double[][] matrix;

    public Matrix(int row, int col, double[][] array) {
        M = row;
        N = col;
        matrix = array;
    }

    public Matrix zero(Matrix a) {
        double[][] res = new double[N][M];
        a.matrix = res;
        return a;
    }

    public static Matrix identity(Matrix a) {
        double[][] res = new double[a.N][a.N];
        for (int i = 0; i < a.N; i++) {
            res[i][i] = 1;
        }
        Matrix m = new Matrix(a.N, a.N, res);
        return m;
    }

    public Matrix sorted_by_rows(Matrix m) {
        double[][] arr = new double[M][N];
        int r = 0;
        for (double[] ds : matrix) {
            Arrays.sort(ds);
            for (int i = 0, j = ds.length - 1; i < ds.length; i++, j--) {
                arr[r][i] = ds[j];
            }
            r++;
        }
        m.matrix = arr;
        return m;
    }

    public Matrix sum(Matrix a, Matrix b) {
        double[][] res = new double[a.M][a.N];
        for (int i = 0; i < a.M; i++) {
            for (int j = 0; j < a.N; j++) {
                res[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        Matrix m = new Matrix(a.M, a.N, res);
        return m;
    }
    public Matrix difference(Matrix a, Matrix b) {
        double[][] res = new double[a.M][a.N];
        for (int i = 0; i < a.M; i++) {
            for (int j = 0; j < a.N; j++) {
                res[i][j] = a.matrix[i][j] - b.matrix[i][j];
            }
        }
        Matrix m = new Matrix(a.M, a.N, res);
        return m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowDelim = "";
        String colDelim = "";

        for (double[] row : matrix) {
            sb.append(rowDelim);
            for (double elem : row) {
                sb.append(colDelim);
                colDelim = ", ";
                sb.append(elem);
            }
            rowDelim = ";";
            colDelim = "\n";
        }
        sb.append(rowDelim);
        sb.append(colDelim);
        return sb.toString();
    }
    public Matrix transpose(Matrix a) {
        double[][] res = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res[i][j] = a.matrix[j][i];
            }
        }
        Matrix m = new Matrix(N, M, res);
        return m;
    }
}