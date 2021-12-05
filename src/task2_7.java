import java.text.DecimalFormat;

public class task2_7 {
    public static void main(String[] args) {

            int n = 10;

            double[][] a = new double[n][n];
            int numberOfPositiveElements = 0;


            for (int i = 0; i < a.length; i++) {
                System.out.println();
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / 10);
                    if (a[i][j] >= 0) {
                        numberOfPositiveElements++;
                    }
                    System.out.print((a[i][j]));
                }
            }
            System.out.println();
            System.out.println("Колличество положительных элементов " + numberOfPositiveElements);

        }

    }

