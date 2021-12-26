/*
    Формирует матрицу по шаблону
    1 2 3 ... n
    n n-1 n-2...1
    1 2 3 ... n
    n n-1 n-2...1
    .............
    n n-1 n-2...1
 */

public class task2_4 {
    public static void main(String[] args) {
        int n = 6; // Задаем размерность
        int[][] a = new int[n][n]; // cоздаем массив
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) { //
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = j + 1; // если кратно двум, то идем от 1 до 6
                }
            } else {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = n - j; // в противном случае, идем от n (6) до единицы
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) { // перебираем двойной массив j и i
                System.out.print(a[i][j] + " ");
            }
        }
    }
}