import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int value = -1000;

        System.out.println("Модуль числа " + value + " = " + abs(value));
    }

    public static int abs(int x){
        int res =  x>0 ? x : -x;
        return res;
    };
}

