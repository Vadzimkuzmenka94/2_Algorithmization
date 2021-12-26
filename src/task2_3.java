//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.


public class task2_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int mas[][] = {{2, 3, 1},
                        {2, 6, 7},
                        {1, 3, 6}};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[a][i] + ". ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][b] + ". ");
        }
            }
        }

