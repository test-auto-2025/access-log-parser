
public class Main {
    public static void main(String[] args) {
       int a = 8;
       int b = 15;
       int c = 9;
        System.out.println("Число " + a + " Делится на цело на 3 или на 5: is " + is35(a));
        System.out.println("Число " + b + " Делится на цело на 3 или на 5: is " + is35(b));
        System.out.println("Число " + c + " Делится на цело на 3 или на 5: is " + is35(c));

    }

    public static boolean is35(int x){
        return (x % 3 == 0 || x % 5 == 0) && (x % 15 != 0);

    }
}

