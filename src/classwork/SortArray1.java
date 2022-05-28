package classwork;

public class SortArray1 {
    public static void main(String[] args) {
        int[] array = {30, 7, 1, 8, 51, 23, 5, 8, 9};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
