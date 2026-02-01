

public class Main {
    public static void main(String[] args) {
       int a = 1000;
       int b = 5;
       int c = -3;
       int d = 0;
        System.out.println("максимум из чисел " + a + " и " + b + " = " + max(a,b));
        System.out.println("максимум из чисел  " + a + " и " + c + " = " + max(a,c));
        System.out.println("максимум из чисел  " + a + " и " + d + " = " + max(a,d));
    }

    public static int max(int x, int y){
        return x > y ? x : y;
      };

}

