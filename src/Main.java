import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа проверки вводимых данных");
        System.out.println("Введите любое положительное число");
        int InputNumber = new Scanner(System.in).nextInt();
        if (InputNumber > 0) {
            System.out.println("Результат проверки числа " + InputNumber + " на двузначность: is " + is2Digits(InputNumber));
        } else {
            System.out.println("Вы ввели отрицательное число!");
        }

    }

    public static boolean is2Digits(int x) {
        if ((x >= 10 && x <= 99) || (x <= -10 && x >= -99)) {
            return true;
        } else {
            return false;
        }
    }


}

