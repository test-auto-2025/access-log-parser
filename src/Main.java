import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа проверки регистра буквы");
        System.out.println("Введите любую букву");
        String singleCharStr = new Scanner(System.in).next(); // Считывает как слово
        char ch1 = 'A';
        if (singleCharStr.length() > 0) {
            ch1 = singleCharStr.charAt(0); // Получаем первый символ
            System.out.println("Вы ввели символ: " + ch1);
        };
        System.out.println("Буква в верхнем реистре: is " + isUpperCase(ch1));
    }

    public static boolean isUpperCase(char a) {
        int asciicode = charToNum(a);
        System.out.println(asciicode);
        if ((asciicode > 64 && asciicode < 91) || (asciicode > 1039 && asciicode < 1072))
            // Проверка для английских букв                Проверка для русских букв
        {
            return true;
        } else {
            return false;
        }
    }

    public static int charToNum(char x) {
        // x - символ, который нужно преобразовать в число
        return (int) x;
    }
    ;
}

