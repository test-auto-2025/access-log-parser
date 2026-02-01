

public class Main {
    public static void main(String[] args) {
       int a = 10;
       int b = 7;
       int c = 3;
       int d = -3;
        System.out.println("Сложение двух изтрех чисел " + a + " и " + b + " и " + c + " даёт 3-е: is " + sum3(a,b,c));
        System.out.println("Сложение двух изтрех чисел " + d + " и " + b + " и " + c + " даёт 3-е: is " + sum3(d,b,c));
        System.out.println("Сложение двух изтрех чисел " + a + " и " + b + " и " + d + " даёт 3-е: is " + sum3(a,b,d));

    }

    public static boolean sum3(int x, int y, int z) {
        if ( x + y == z || x + z == y || y + z == x)
        return true;
        return false;
    }
}

