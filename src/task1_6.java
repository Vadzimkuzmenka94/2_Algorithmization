public class task1_6 {
    public static void main(String[] args) {
        int i;
        int max;
        int sum = 0;
        int[] mas = new int[]{10, 12, 1, 78, 0, 61, 2, 78, 13, 14, 0};
        for (i = 0; i < mas.length; i++) {
            if (i == 1 | i == 2 | i == 3 || i % 2 != 0 & i % 3 != 0) {
                sum = sum + mas[i];
                System.out.println("наростояющая сумма элементов с простым числом в качестве индекса  =" + sum);
            }
        }
    }
}





