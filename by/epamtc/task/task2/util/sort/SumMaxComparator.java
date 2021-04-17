package by.epamtc.task.task2.util.sort;

import java.util.Comparator;

public class SumMaxComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return sum(o1) - sum(o2);
    }

    private int sum(int[] array) {
        if (array == null) {
            //exception
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
