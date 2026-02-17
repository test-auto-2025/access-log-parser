public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 4, -5, -6, 7, 5, 5, -8};
        int[] arr3 = reverseBack(arr1);
        System.out.println("Массив 1");
        for (int i = 0; i <= arr3.length - 1; i++) {
            System.out.print(arr3[i] + ", "); //выводим массив на экран через запятую
        }
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