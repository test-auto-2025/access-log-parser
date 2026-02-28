import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

int a = new int [3][14].length;
System.out.println(a);








        String [][] arr = {{"b", "s", "i"}, {"l","c"}};// двумерный массив строк
        // вывести все элементы массива пока не встретится символ "s"
        // если встретился символ "s" прервать внутренний цикл и перейти к следующей итерации внешнего цикла
                for (int i = 0; i < arr.length ; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                        if (arr[i][j].equals("s")) {break;}
                    }

                    continue;
                }
        System.out.println( " ");











        int[] arr1 = {1, 2, 3, -4, -5, 3, 8, 6, -3, 3};
        int position = 3;
        int[] element = {33, 44, 55, 77};
        int[] arr2 = add(arr1, element,  position);
        System.out.println("вставлено массив начиная с позиции " + position );
        System.out.print(Arrays.toString(arr2));
    }

    public static int[] add(int[] arr, int[] ins, int pos){
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            res[ins.length + i] = arr[i];
        }
        return res;  //метод вставляет массив ins в позицию pos массива arr и возвращает новый массив
    }



    public static int[] add1(int[] arr, int x, int pos){
        int[] res = new int[arr.length+1];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            res[i + 1] = arr[i];
        }
        return res;  //метод вставляет число x в позицию pos массива arr и возвращает новый массив

    }







    public static int[] deleteNegative(int[] arr) {
        int[] res = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res = addLast(res, arr[i]);
            }
        }
        return res;  //метод удаляет из массива все отрицательные элементы и возвращает новый массив
    }

    public static int[] addLast(int[] arr, int x) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        res[res.length - 1] = x;
        return res;  //метод добавляет число x в конец массива arr и возвращает новый массив
    }







    public static int[] findAll(int[] arr, int x) {
        int[] index = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = addLast(index, i);
            }
        }
        return index;  //метод возвращает массив индексов всех вхождений числа x в массиве arr
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int count1 = arr1.length;
        int[] result = new int[count1 + arr2.length];
        for (int i = 0; i < count1; i++) {
            result[i] = arr1[i];  //заполняем новый массив элементами первого массива
        }
        for (int i = 0; i < arr2.length; i++) {
            result[count1 + i] = arr2[i];  //заполняем новый массив элементами второго массива
        }
        return result;
    }

    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;  //метод меняет порядок элементов массива на обратный
    }

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }  //метод меняет порядок элементов массива на обратный
    }

    public static boolean palindrom(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;  //если все элементы равны с двух сторон, то это палиндром
    }

    public static int countPositive(int[] arr) {
        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            }
        }
        return countPositive;
    }

    public static int maxAbs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (x == arr[i]) {
                return i;
            }
        }
        //System.out.println("-1"); //элемент не найден
        return -1;
    }
}