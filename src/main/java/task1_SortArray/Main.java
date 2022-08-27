package task1_SortArray;

import org.junit.Assert;
import java.util.Arrays;

/*
Отсортируйте массив [5,6,3,2,5,1,4,9]
 */


public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 6, 3, 2, 5, 1, 4, 9};

        countSort(arr);
        System.out.println("Sorted array order by ASC:" + Arrays.toString(arr));

        //Test
        Assert.assertEquals(
                Arrays.toString(arr),
                Arrays.toString(new int[]{1, 2, 3, 4, 5, 5, 6, 9}));

        Assert.assertEquals(
                Arrays.toString(countSort(new int[]{6, 4, 3, 4, 5, 5, 4, 9, 6})),
                Arrays.toString(new int[]{3, 4, 4, 4, 5, 5, 6, 6, 9}));

        Assert.assertEquals(
                Arrays.toString(countSort(new int[]{46, 77, 13, 46, 46, 5, 89, 77, 77})),
                Arrays.toString(new int[]{5, 13, 46, 46, 46, 77, 77, 77, 89}));

    }

    private static int[] countSort(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        int[] counts = new int[max + 1];

        for (int i : arr) {
            counts[i]++;
        }

        //sorting in ascending order
        int c = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[c] = i;
                c++;
                counts[i]--;
            }
        }

       /*
       //counting sort descending order
       int c = arr.length-1;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[c] = i;
                c--;
                counts[i]--;
            }
        }
        */
        return arr;
    }


}
