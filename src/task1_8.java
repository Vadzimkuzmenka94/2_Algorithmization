//Дана последовательность целых чисел
//a a an
//, , ,
//1 2
//. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min( , , , ) a1 a2  an
//.

public class task1_8 {

    public static void main(String[] args) {
        int[] mas = { 1, 2, 0, -12, 5, 6, 7, -12, -10, -12, -9 };
        System.out.println("Исходный массив");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int min = mas[0];
        int counter = 0;

        for (int i = 0; i < mas.length; i++) {//
            if (mas[i] < min) {
                min = mas[i];
                counter = 0;
            }
            if (mas[i] == min) {//
                counter++;
            }
        }

        int[] mas1 = new int[mas.length - counter];//

        for (int i = 0, j = 0; i < mas.length; i++) {//
            if (mas[i] != min) {
                mas1[j] = mas[i];
                j++;
            }
        }
        System.out.println("Конечный массив массив");
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }
    }

}