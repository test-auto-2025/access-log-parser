
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        System.out.println(pow(a , b));
    }

    public static int pow(int x, int y){
    int result = 1;
        for (int i = 0; i < y; i++) {
        result *= x;
    }
        return result;
}





    public static String chet(int x) {
        for (int i = 0; i < x; i += 2)
        System.out.print (i + " ");
        return "";
    }






    public static String reverseListNums(int x) {
        for (int i = x; i >= 0; i--)
            System.out.print(i + " ");
        return "";
    }

    public static String listNums(int x) {
        for (int i = 0; i <= x; i++)
            System.out.print(i + " ");
        return "";

    }


}
