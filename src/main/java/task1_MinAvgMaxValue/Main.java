package task1_MinAvgMaxValue;

import java.util.Random;

    /*
   Заполните массив случайным числами и выведите максимальное,
   минимальное и среднее значение.
    */


public class Main {

    public static final int ROW = 10; //length array row
    public static final int COLUMN = 10; //length array column

    public static void main(String[] args) {

        Random random = new Random();

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        int[][] arr = new int[ROW][COLUMN];

        // filling an array with random values
        // and finding the minimum and maximum value
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10, 90);
                count++;
                sum = sum + arr[i][j];
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }

        printMatrix(arr);

        double avgValue = (double) sum / count;

        System.out.printf("Max value in array = %d\n", maxValue);
        System.out.printf("Min value in array = %d\n", minValue);
        System.out.printf("Average value in array = %.2f\n", avgValue);
    }

    // method to display the matrix on the console
    private static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.format("%4d", anInt);
            }
            System.out.println();
        }
    }


}

