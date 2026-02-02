
public class Main {
    public static void main(String[] args) {
        int a = 111;
        int b = 702;
        int c = 13;
        int d = 35;
        System.out.println("Его возраст " + a + " "+ age(a));
        System.out.println("Его возраст " + b + " "+ age(b));
        System.out.println("Его возраст " + c + " "+ age(c));
        System.out.println("Его возраст " + d + " "+ age(d));
    }

    public static String age(int x) {

            int y = x % 100; // остаток от деления на 100
            if (y >= 11 && y <= 14) {
                return "лет";
            } else { // если число не входит в диапазон 11-14, проверяем последнюю цифру числа
                switch (y % 10) {
                    case 1:
                        return "год";
                    case 2:
                    case 3:
                    case 4:
                        return "года";
                    default:
                        return "лет";
                }

            }
        }
    }
