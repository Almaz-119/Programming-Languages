class PointMain {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 3;
        p.y = 3;
        p.move(1,1);
        System.out.println(p.x + " " + p.y);
        
        p.mirror(1,3);
        System.out.println(p.x + " " + p.y);

        Point origin = new Point();
        origin.x = origin.y = 0;
        p.mirror(origin);

        System.out.println(p.x + " " + p.y);
        System.out.println("ditance from p to origin: " + p.distance(origin));
    }
}