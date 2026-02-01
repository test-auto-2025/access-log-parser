

public class Main {
    public static void main(String[] args) {
       int a = 1000;
       int b = 5;
       int c = -3;
       int d = 0;
        System.out.println("Результат сравнения " + a + " и " + b + " = " + makeDecision(a,b));
        System.out.println("Результат сравнения " + b + " и " + c + " = " + makeDecision(b,c));
        System.out.println("Результат сравнения " + c + " и " + d + " = " + makeDecision(c,d));
    }

    public static String makeDecision(int x, int y){
        if (x < y){
            return x + " < " + y;
        } else if (x > y){
            return x + " > " + y;
        } else {
            return x + " = " + y;
        }
    }


}

