import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа вычисления ASCII кода");
        System.out.println("Введите любую цифру от 0 до 9");
        int InputNumber = new Scanner(System.in).nextInt(); // Считывает как слово
        System.out.println("Результат проверки числа " + InputNumber + " на положительность: is " + isPositive(InputNumber));
    }

    public static boolean isPositive(int x) {

        if (x > 0) {
            return true;
        } else {
            return false;
        }  // Возвращает результат проверки числа на положительность. Если число положительное, то возвращается true, иначе - false.
    }


}

