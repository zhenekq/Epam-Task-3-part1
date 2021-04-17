package by.epamtc.task.task2.util.sort;

import java.util.Comparator;

public class MaxElementComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return max(o1) - max(o2);
    }

    private int max(int[] array) {
        if (array == null) {
            //exception
        }
        int max = array[0];
        for (int element : array) {
            if(element > max)
                max = element;
        }
        return max;
    }
}
