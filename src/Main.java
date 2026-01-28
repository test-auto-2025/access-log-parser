import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любые 3 числа");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        System.out.println("Проверка: Введенные числа " + a + " и " + b + " равны: is " + isDivisor(a, b));
    }

    public static boolean isEqual (int aa, int bb, int cc)
    {
        if (aa == bb && bb == cc) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisor(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        System.out.println("min = " + min );
        System.out.println("max = " + max );
        double devisionResult =(double) max / min;
        System.out.println("devisionResult = " + devisionResult );
        int CSchastnoe = (int) devisionResult;
        System.out.println("(int) devisionResult = " + CSchastnoe );
        double res = CSchastnoe / devisionResult;
        System.out.println("result = " + res );
        if (res < 1) {
            return false;
        } else {
            return true;
        }
    }


}

