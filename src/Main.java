import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое числ");
        int a = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Введите число");
            a = lastNumSum(a,new Scanner(System.in).nextInt());
            System.out.println("Подитог: " + a);
        }
        System.out.println("Результат суммы последних цифр: " + a);
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }


}

