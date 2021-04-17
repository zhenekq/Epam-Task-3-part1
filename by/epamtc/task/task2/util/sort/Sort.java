package by.epamtc.task.task2.util.sort;

import java.util.Comparator;

public class Sort {
    public static void sort(int[][] array, boolean way, Comparator<int[]> howCompare) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (howCompare.compare(array[j], array[j + 1]) > 0 == way) {
                    int[] tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
