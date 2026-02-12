public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println (findFirst(arr1, 6));
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("элемент с номером" + i );
                return i;
            }
        }
        System.out.println("-1"); //элемент не найден
        return -1;
    }
}