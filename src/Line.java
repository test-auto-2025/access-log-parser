public class Line {
    int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);//constructor chaining

    public Line(Point p1, Point p2) {
        this.x1 = p1.getX();
        this.y1 = p1.getY();
        this.x2 = p2.getX();
        this.y2 = p2.getY();
    }

    public double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String toString() {
        return "Line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }
}

