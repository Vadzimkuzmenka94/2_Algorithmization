//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать

import java.util.Arrays;

public class task1_10 {
        public static void main(String[] args) {
            int [] mas = new int []{1,4,6,9,12,16};

            System.out.println(Arrays.toString(mas));
            for (int i = 0; i < mas.length; i++) {
                if(i%2 == 1){
                    mas[i] = 0;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
