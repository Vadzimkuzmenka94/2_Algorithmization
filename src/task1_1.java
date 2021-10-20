public class task1_1 {

    public static void main(String[] args) {
        int k, i, sum;
        int[] array;

        k = 40;
        sum = 0;
        array = new int[] { 23, 54, 20, 40, 45, 80, 12, 53, 120, 160 };

        for (i = 0; i < array.length; i++) {

            if ((array[i] % k) == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов, кратных K: " + sum);
    }
}