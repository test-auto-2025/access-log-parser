public class Start {
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 11;
        int a2 = 15;
        int b2 = 19;
        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 8);
        Point p3 = new Point(a1, b1);
        Point p4 = new Point(a2, b2);
        System.out.println("Point1 = " + p1);
        System.out.println("Point2 = " + p2);
        System.out.println("Point3 = " + p3);
        System.out.println("Point4 = " + p4);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(a1, b1, a2, b2);
        Line l3 = new Line(p2, p3);
        System.out.println("Line1 = " + l1 + " длина: " + l1.getLength());
        System.out.println("Line2 = " + l2 + " длина: " + l2.getLength());
        System.out.println("Line3 = " + l3 + " длина: " + l3.getLength());

        System.out.println("Меняем координаты точек линий: ");
        l1.x2 = l3.x1 = 10;
        l1.y2 = l3.y1 = 10;
        l2.x1 = l3.x2 = 7;
        l2.y1 = l3.y2 = 6;
        //также можно сначал апоменять точки а потом переопределить линии по этим точкам
        System.out.println("Line1 = " + l1 + " длина: " + l1.getLength());
        System.out.println("Line2 = " + l2 + " длина: " + l2.getLength());
        System.out.println("Line3 = " + l3 + " длина: " + l3.getLength());

        double sum = l1.getLength() + l1.getLength() + l2.getLength();
        System.out.println("Сумма длин =  " + sum);
    }
}