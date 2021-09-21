class Rectangle {
    double x, y, width, height;
    Point p = new Point();
    public Point topLeft(double x, double y) {
        if (x < width) {
            p.x = x;
        }else {
            p.x = (x - width); 
        }
        if (y < height) {
            p.y = y + height;
        }else {
            p.y = y;
        }
        return p;
    }
    public Point topRight(double x, double y) {
        if (x < width) {
            p.x = x + width;   
        }else {
            p.x = x;
        }
        if (y < height) {
            p.y = y + height;
        }else {
            p.y = y;
        }
        return p;
    }
    public Point bottomLeft(double x, double y) {
        if (x < width) {
            p.x = x;   
        }else {
            p.x = (x - width); 
        }
        if (y < height) {
            p.y = y;
        }else {
            p.y = y + height;
        }
        return p;
    }
    public Point bottomRight(double x, double y) {
        if (x < width) {
            p.x = x + width;   
        }else {
            p.x = x;
        }
        if (y < height) {
            p.y = y;
        }else {
            p.y = y + height;
        }
        return p;
    }
    
}