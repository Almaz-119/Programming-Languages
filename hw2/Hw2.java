class Hw2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Point point = new Point();
        int num = 1;
        for (int i = 0; i < args.length; i++) {
            r.x = Integer.parseInt(args[i]);
            i++;
            r.y = Integer.parseInt(args[i]);
            i++;
            r.width = Integer.parseInt(args[i]);
            i++;
            r.height = Integer.parseInt(args[i]);
            System.out.println("Rectangle #: " + num);
            point = r.topLeft(r.x, r.y);
            System.out.println("Top Left: x= " + point.x + ", y= " + point.y);
            point = r.topRight(r.x, r.y);
            System.out.println("Top Right: x= " + point.x + ", y= " + point.y);
            point = r.bottomLeft(r.x, r.y);
            System.out.println("Bottom Left: x= " + point.x + ", y= " + point.y);
            point = r.bottomRight(r.x, r.y);
            System.out.println("Bottom Right: x= " + point.x + ", y= " + point.y);
            num++;
        }
    }
}