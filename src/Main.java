

public class Main {
    public static void main(String[] args) {
       int a = 1000;
       int b = 5;
       int c = -3;
       int d = 0;
        System.out.println("Результат сравнения " + a + " и " + b + " и " + c + " = " + max3(a,b,c));
        System.out.println("Результат сравнения " + d + " и " + b + " и " + c + " = " + max3(d,b,c));
        System.out.println("Результат сравнения " + a + " и " + b + " и " + d + " = " + max3(a,b,d));
    }

    public static int max3(int x, int y, int z){
        int res = x > y ? x : y;
        return res > z ? res : z;
    }

}

