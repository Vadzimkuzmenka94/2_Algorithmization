/*
    Формирует матрицу по шаблону:
    1 1 1 ... 1 1 1
    2 2 2 ... 2 2 0
    3 3 3 ... 3 0 0
    ...............
    n 0 0 ... 0 0 0
 */


public class task2_5 {
    public static void main(String[] args) {
        int n = 10; // задаем размерность
        int[][] a = new int[n][n]; // создаем двумерный массив
        for (int i = 0, k = a.length; i < a.length; i++, k--) { // создаем цикл где i = 0 а k = 10. i возрастает а k убывает
            for (int j = 0; j < k; j++) { // j возрастает пока меньше k
                a[j][i] = j + 1; // добавление единицы к столбцу
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

