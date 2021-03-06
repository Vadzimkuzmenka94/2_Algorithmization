import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Находит в массиве второе по величине число
 */

public class task4_5 {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Массив должен состоять, как минимум, из двух элементов!");
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else {
                if ((value < largest && value > secondLargest) || largest == secondLargest) {
                    secondLargest = value;
                }
            }
        }

        return secondLargest;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 41 - 20);
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер массива:");

            int size = in.nextInt();

            if (size > 0) {
                int[] array = new int[size];
                fillArray(array);

                System.out.println("Cгенерированный массив:");
                printArray(array);

                try {
                    System.out.println("\nВторое по величине число = " + findSecondLargest(array));
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

            } else {
                System.out.println("Размер массива должен быть положителен!");
            }

        } catch (InputMismatchException ex) {
            System.out.println("Ошибка ввода! " + ex.getMessage());
        }
    }
}