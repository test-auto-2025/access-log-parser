
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 9;
        int d = -3;
        System.out.println("a = " + a + " b = " + b +  " Check: is " + magic6(a,b));
        System.out.println("a = " + a + " c = " + c +  " Check: is " + magic6(a,c));
        System.out.println("b = " + b + " c = " + c +  " Check: is " + magic6(b,c));
        System.out.println("c = " + c + " d = " + d +  " Check: is " + magic6(c,d));
        System.out.println("d = " + d + " a = " + a +  " Check: is " + magic6(d,a));
        System.out.println("d = " + d + " b = " + b +  " Check: is " + magic6(b,d));


    }

    public static boolean magic6(int x, int y) {
        return (x == 6 || y == 6 || x + y == 6 || x - y == 6 || y - x == 6);

    }
}

