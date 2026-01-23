import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа проверки попадания в диапазон");
        System.out.println("Введите любые 3 числа");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int num = new Scanner(System.in).nextInt();

        System.out.println("Результат проверки числа " + num + " на попадание в диапазон между " + a + " до " + b + ": " + isInRange(a, b, num));
       }

    public static boolean isInRange(int x, int y, int z) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        if (z >= min && z <= max) {
            return true;
        } else {
            return false;
        }  // Возвращает результат проверки числа на попадание в заданный диапазон. Если число попадает в диапазон, то возвращается true, иначе - false.
    }

 }

