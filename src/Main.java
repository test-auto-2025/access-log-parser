
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 7;
        int d = 35;
        System.out.println("День недели " + a + " - " + weekday(a));
        System.out.println("День недели " + b + " - " + weekday(b));
        System.out.println("День недели " + c + " - " + weekday(c));
        System.out.println("День недели " + d + " - " + weekday(d));
    }

    public static String weekday(int x) {

        switch (x) {
            case 1:
                return "Пенедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";

            default:
                return "это не день недели!";


        }
    }
}
