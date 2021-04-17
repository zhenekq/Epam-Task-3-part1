package by.epamtc.task.task2.util.sort;

import java.util.Comparator;

public class MinElementComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return min(o1) - min(o2);
    }

    private int min(int[] array) {
        if (array == null) {
            //exception
        }
        int min = array[0];
        for (int element : array) {
            if(element < min)
                min = element;
        }
        return min;
    }
}
