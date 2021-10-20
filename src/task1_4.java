import java.util.Arrays;

public class task1_4 {
    public static void main(String[] args) {
        int[] mas = new int[]{10, 12, 114, 78, 87, 61, 2, 78, 12, 14, 0, 0};
        int a, b, t, size;
        size = mas.length;
            for (a = 1; a < size; a++)
                for (b = size - 1; b >= a; b--) {
                    if (mas[b - 1] > mas[b]) {
                        t = mas[b - 1];
                        mas[b - 1] = mas[b];
                        mas[b] = t;
                    }
                }
            System.out.println("отсортированный массив:");
            for (int k = 0; k < mas.length; k++) {
                System.out.print(" " + mas[k]);
                System.out.print( " ");
            }
        int temp = mas[0];
        mas[0] = mas[11];
        mas[11] = temp;
        System.out.println("после замены:");
        for (int k = 0; k < mas.length; k++) {
            System.out.print(" " + mas[k]);
        }
        }
    }

