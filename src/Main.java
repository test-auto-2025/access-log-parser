
public class Main {
    public static void main(String[] args) {
       int a = 12;
       int b = 8;
       int c = 9;
        System.out.println("Число " + a + " Делится на цело на 3 и на 5: is " + is35(a));
        System.out.println("Число " + b + " Делится на цело на 3 и на 5: is " + is35(b));
        System.out.println("Число " + c + " Делится на цело на 3 и на 5: is " + is35(c));

    }

    public static boolean is35(int x){
        return x % 3 == 0 || x % 5 == 0;
    }
}

