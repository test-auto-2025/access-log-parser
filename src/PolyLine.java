import java.util.List;
import java.util.ArrayList;

public class PolyLine {
    PolyLine() {    }

    List<Integer> lstx = new ArrayList<>();// list of points
    List<Integer> lsty = new ArrayList<>();// list of points

    public PolyLine(List<Integer> lstx, List<Integer> lsty) {
        this.lstx = lstx;
        this.lsty = lsty;
    }

    public void addPoint(Point newpoint) {
        lstx.add(newpoint.x);
        lsty.add(newpoint.y);
    }

    public double getPolyLineLength() {
        double length = 0;
        for (int i = 1; i < lstx.size(); i++) {
            length += Math.sqrt(Math.pow(lstx.get(i) - lstx.get(i - 1), 2) + Math.pow(lsty.get(i) - lsty.get(i - 1), 2));
        }
            return length;
    }

    public void setPoint(int pointNumber, Point newPoint) {
        lstx.set(pointNumber, newPoint.x);// заменяет элемент под индексом pointNumber на новый элемент newPoint.x
        lsty.set(pointNumber, newPoint.y);
    }

    public String toString() {
        return "Ломаная c координатами по оси Х  : " + lstx + " и Y: " + lsty;
    }
}
