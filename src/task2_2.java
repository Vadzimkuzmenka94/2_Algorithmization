//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class task2_2 {
    public static void main(String[] args) {
        int[][] a = { { 51, 4, 12, 98 }, { 8, 1, 4, 1 }, { 3, 19, 1, 9 }, { 14, 8, 3, 0 } };
        System.out.println("Изначальный вид матрицы");
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Числа стоящие по диагонали");
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            System.out.println(a[i][j]);
        }
    }
}
