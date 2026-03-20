public class Start {

    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);
        System.out.println("Point1 = " + p1);
        System.out.println("Point2 = " + p2);
        System.out.println("Point3 = " + p3);

        System.out.println("Point1 = Point2: " + (p1 == p2));
        System.out.println("Point2 = Point3: " + (p2 == p3));
        System.out.println("Point1 = Point3: " + (p1 == p3));

    }
}