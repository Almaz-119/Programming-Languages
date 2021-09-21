class PointMain {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 3;
        p.y = 3;
        p.move(1,1);
        System.out.println(p.x + " " + p.y);
        
        p.mirror(1,3);
        System.out.println(p.x + " " + p.y);
    }
}