package ex2.b;

public class Point {
    private double x, y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y; 
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public static Point centerOfMass(Point arr[]) {
        double center_x = 0, center_y = 0;
        for (int i = 0; i < arr.length; i++) {
            center_x += arr[i].getX();
            center_y += arr[i].getY();
        }
        center_x /= arr.length;
        center_y /= arr.length;

        return new Point(center_x, center_y);
    }
}