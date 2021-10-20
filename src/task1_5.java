public class task1_5 {
    public static void main(String[] args) {
        int i;
        int[] mas = new int[]{10, 12, 1, 78, 0, 61, 2, 78, 12, 14, 0, 0};
        for (i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.println(mas[i]);
            }
        }
    }
}