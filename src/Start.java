public class Start {
    public static void main(String[] args) {
        Point[] points = new Point[5];
        points[0] = new Point(1, 5);
        points[1] = new Point(2, 8);
        points[2] = new Point(5, 3);
        points[3] = new Point(8, 9);
        for (int j = 0; j < 4; j++){
            System.out.println("Point " + j + " = " + points[j]);
        }
        PolyLine pl = new PolyLine();
        for (int j = 0; j < 4; j++){
            pl.addPoint(points[j]);
            //System.out.println("PolyLine = " + pl + " длина: " + pl.getPolyLineLength());
        }
        System.out.println("1.2. PolyLine = " + pl + " длина: " + pl.getPolyLineLength());
        Line[] lines = new Line[5];
        for (int j = 0; j < 3; j++){
            lines[j] = new Line(points[j], points[j + 1]);
            System.out.println("3.   Line = " + lines[j] + ", и ее длина: " + lines[j].getLength());
        }
        double sum =0;
        for (int j = 0; j < 3; j++) {
            sum = sum + lines[j].getLength();// суммируем длины отрезков
        }
        System.out.println("4. Сумма длин отрезков: " + sum);
        System.out.println("5. Длина Ломаной и массива Линий - равны : " + (sum==pl.getPolyLineLength())); // сравниваем с длиной полилинии

       // Меняем точку
        points[1].x = 12;
        lines[0].x2 = points[1].x;
        lines[1].x1 = points[1].x;
        pl.setPoint(1, points[1]);
        System.out.println("6.   PolyLine = " + pl + " длина: " + pl.getPolyLineLength());
    }
}