//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
import java.util.Arrays;

public class task1_2 {
    public static void main(String[] args) {
        int i;
        int count = 0;
        int [] mas = new int [] {10,12, 114,78,87,61,2,78};
        System.out.println(Arrays.toString(mas));

        for (i = 0; i <mas.length; i++) {
            if(mas[i]>60) {
                mas[i]=60;
                count++;
                System.out.println(Arrays.toString(mas));
                System.out.println("количество замен" + count);
            }
        }

    }
}
