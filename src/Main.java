import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа вычисления.");
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        //System.out.println("Введите второе число:");
        //int number2 = new Scanner(System.in).nextInt();

        System.out.println("Результат сложения двух последних знаков числа: " + sumLastNums(number1));
    }

    public static int sumLastNums(int input) {
    int LastOne = input % 10;
    int LastTwo = (input / 10) % 10;
    System.out.println("LastOne: " + LastOne + " LastTwo: " + LastTwo);
    return LastOne + LastTwo;

}
}