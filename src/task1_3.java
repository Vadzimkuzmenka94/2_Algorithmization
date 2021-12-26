//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
import java.util.Arrays;

public class task1_3 {
    public static void main(String[] args) {
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;
        int i;
        int [] mas = new int [] {10,12, 114,78,87,61,2,78,-12, -14, 0, 0};
        System.out.println(Arrays.toString(mas));
        for (i = 0; i <mas.length; i++) {
            if (mas[i] < 0) {
                countMinus++;
                System.out.println("количество отрицательных = " + countMinus);
            }
        }
        for (i = 0; i <mas.length; i++) {
            if (mas[i] > 0) {
                countPlus++;
                System.out.println("количество положительных = " + countPlus);
            }
        }
        for (i = 0; i <mas.length; i++) {
                    if (mas[i]==0) {
                        countZero++;
                        System.out.println("количество нулей " + countZero);
                    }
                }
            }
        }


