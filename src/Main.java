public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 5, 5, 8};
        System.out.println (findLast(arr1, 7));
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length-1; i > 0; i--) {
            if (x == arr[i]) {
                return i;
            }
        }
       //System.out.println("-1"); //элемент не найден
        return -1;
    }
}