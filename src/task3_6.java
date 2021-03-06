/*
    Сортировка Шелла
 */

public class task3_6 {
    public static void sortShell(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                swapTwoArrayElements(array, i, i + 1);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    public static void swapTwoArrayElements(int[] array, final int INDEX1, final int INDEX2) {
        int time = array[INDEX1];
        array[INDEX1] = array[INDEX2];
        array[INDEX2] = time;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 41, 18, 112, 18, 19, 3, 2, 1, 189, -1, -19};

        sortShell(arr1);

        printArray(arr1);
    }
}