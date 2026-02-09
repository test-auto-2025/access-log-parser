
public class Main {
    public static void main(String[] args) {
        int a = 777777777;
        int b = 1122;
        System.out.println("Проверка цифры числа " + a + " на одинаковость: " + equalNum(a));
        System.out.println("Проверка цифры числа " + b + " на одинаковость: " + equalNum(b));
    }














    public static boolean equalNum(int x){
        int y = x % 10;
        while (x>10) {
            x = x / 10;
            if (y != x % 10) return false;
        }
        return true;
    }


    public static int numLen(long x) //количество знаков в числе x
    {
        int y = 1;
        for (int i = 1; x >= 10; i++) {
            x = x / 10;
            y = y + 1;
        }
        return y;

    }

    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static String chet(int x) {
        for (int i = 0; i < x; i += 2)
            System.out.print(i + " ");
        return "";
    }

    public static String reverseListNums(int x) {
        for (int i = x; i >= 0; i--)
            System.out.print(i + " ");
        return "";
    }

    public static String listNums(int x) {
        for (int i = 0; i <= x; i++)
            System.out.print(i + " ");
        return "";

    }

}
