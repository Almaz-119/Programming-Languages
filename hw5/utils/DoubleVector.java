package utils;

public class DoubleVector {
    double[] vector;

    public DoubleVector(double[] vector) {
        this.vector = vector;
    }

    public void sum(DoubleVector v) {
        for (int i = 0; i < v.vector.length; i++) {
            vector[i] += v.vector[i];
        }
    }
    public void difference(DoubleVector v) {
        for (int i = 0; i < v.vector.length; i++) {
            vector[i] -= v.vector[i];
        }
    }
    public void product(DoubleVector v) {
        for (int i = 0; i < v.vector.length; i++) {
            vector[i] *= v.vector[i];
        }
    }
     public String toString() {
        String s="[";
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                s += vector[i];
            }else {
                s += vector[i] + ",";
            }
        }
        s+="]";
        return s;
    }
}