
public class Main {
    public static void main(String[] args) {
       int a = 12;
       int b = 8;
       int c = 9;
       int d = -3;
        System.out.println("Сложение двух чисел " + a + " и " + b + " даёт  " + sum2(a,b));
        System.out.println("Сложение двух чисел " + c + " и " + b + " даёт  " + sum2(c,b));
        System.out.println("Сложение двух чисел " + d + " и " + b + " даёт  " + sum2(d,b));
        System.out.println("Сложение двух чисел " + a + " и " + c + " даёт  " + sum2(a,c));
        System.out.println("Сложение двух чисел " + b + " и " + c + " даёт  " + sum2(b,c));
        System.out.println("Сложение двух чисел " + d + " и " + c + " даёт  " + sum2(d,c));
        System.out.println("Сложение двух чисел " + a + " и " + d + " даёт  " + sum2(a,d));
    }

    public static int sum2(int x, int y) {
       int res = x + y;
       if (res > 10 && res < 20) {
            return 20;
        } else {
            return res;
        }
    }
}

