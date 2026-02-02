
public class Main {
    public static void main(String[] args) {
        String a = "Среда";
        printDays(a);
    }

    public static void printDays(String x) {
        switch (x) {
            case "Пенедельник":
                System.out.println("Пенедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
        }
    }
}
