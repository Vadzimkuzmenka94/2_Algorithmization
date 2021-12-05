public class task2_1 {
    public static void main(String[] args) {
        int mas[][] = {{2, 3, 1, 2, 7, 10}, {2, 6, 7, 8, 9, 10}, {1, 3, 6, 7, 10, 11}};
        for (int i = 0, j = 0; j < mas[i].length; j += 2) {
            if (mas[0][j] > mas[mas.length - 1][j]) {
                System.out.println("Столбец " + j);
                for (int k = 0; k < mas.length; k++) {
                    System.out.println(mas[k][j]);
                }
            }
        }
    }
}
