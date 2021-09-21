class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("the area of the circle: " + circle.getArea());

        circle.enlarge(2);
        System.out.println("after enlarge "+ circle.getArea());

    }
}