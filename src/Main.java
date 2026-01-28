import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое числ");
        int a = new Scanner(System.in).nextInt();
        int b = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Введите число");
            b = new Scanner(System.in).nextInt();
            a = lastNumSum(a,b);
            System.out.println("Подитог: " + a);
        }
        System.out.println("Результат суммы последних цифр: " + a);
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }


}

