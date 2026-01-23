import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа проверки попадания в диапазон");
        System.out.println("Введите любые 2 числа");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("Проверка: Введенные числа " + a + " и " + b + " делятся нацело одно на другое: is " + isDivisor(a, b));
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

