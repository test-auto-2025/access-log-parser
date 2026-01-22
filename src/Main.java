import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа вычисления ASCII кода");
        System.out.println("Введите любую цифру от 0 до 9");
        String singleCharStr = new Scanner(System.in).next(); // Считывает как слово
        char ch1 = 'A';
        if (singleCharStr.length() > 0) {
            ch1 = singleCharStr.charAt(0); // Получаем первый символ
            System.out.println("Вы ввели символ: " + ch1);
        }

        System.out.println("Результат преобразования символа " + ch1 + " в число: " + charToNum(ch1));
    }

    public static int charToNum(char x)
    {
        // x - символ, который нужно преобразовать в число
          return (int) x;
    }

}