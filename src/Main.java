import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int successTries = 0;
        int losedTries = 0;
        while (true) {
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Это папка, а не файл!");
                losedTries++;
                System.out.println("Неудачных попыток: " + losedTries);
                continue;
            }

            boolean fileExist = file.exists();
            if (!fileExist) {
                System.out.println("Неверно указан путь или файл не найден");
                losedTries++;
                System.out.println("Неудачных попыток: " + losedTries);
                continue;
            }

            System.out.println("Ура! Файл найден!");
            successTries++;
            System.out.println("Успешных попыток: " + successTries);
        }

    }


}
