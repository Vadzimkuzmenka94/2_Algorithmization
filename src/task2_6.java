/*
    Формирует матрицу по шаблону
        1 1 1 ... 1 1 1
        0 1 1 ... 1 1 0
        0 0 1 ... 1 0 0
        ...............
        0 1 1 ... 1 1 0
        1 1 1 ... 1 1 1
 */

public class task2_6 {
    public static void main(String[] args) {
        int n = 8;
        int[][] a = new int[n][n];

        for (int i = 0, k = 0; i < a.length; i++, k++) {
            for (int j = k; j < a.length - k; j++) {
                a[i][j] = 1;
                a[a.length - i - 1][a.length - j - 1] = 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j]);
            }
        }
    }
}