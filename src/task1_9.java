//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class task1_9 {
    public static void main(String[] args) {
        int[] data = { 2, 1, 10, 2, 3, 5,14, 7, 5, 8,14, 9, 78, 7, 8, 76, 65, 45, 34, 3, 4, 14, 5, 6, 78, 2 };
        int[] counter = new int[data.length];// количество повторений
        boolean[] check =  new boolean[data.length];// флаг, чтобы не проверять повторяющиеся элементы

        for (int i = 0; i < data.length; i++) { // поиск повторяющихся элементов
         if (!check[i]) {
             for (int j = i + 1; j < data.length; j++) {
                 if (!check[j]) {
                     if (data[i] == data[j]) {
                         check[j] = true;
                            counter[i]++;
                       }
                    }
             }
        }
        }

        int minValue = 0;
        int maxNumberOfCopies = 0;
        for (int i = 0; i < data.length; i++) {// поиск элемента с максимальным числом повторений
        if (counter[i] > maxNumberOfCopies) {
        maxNumberOfCopies = counter[i];
        minValue = data[i];// присвоим значение из числа тех элементов, которые встречаются чаще всех
        }

        }
        for (int i = 0; i < data.length; i++) {
        if (counter[i] == maxNumberOfCopies && data[i] < minValue) {// найдём наименьшее значение из
        minValue = data[i]; // наиболее часто встречающихся элементов
        }
        }
        System.out.printf("Максимальное число повторений и минимальное значение у элемента " + minValue);

        }

        }
