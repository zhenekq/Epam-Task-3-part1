package by.epamtc.task.task2.util.test;

import by.epamtc.task.task2.util.print.PrintJagged;
import by.epamtc.task.task2.util.sort.MaxElementComparator;
import by.epamtc.task.task2.util.sort.MinElementComparator;
import by.epamtc.task.task2.util.sort.Sort;
import by.epamtc.task.task2.util.sort.SumMaxComparator;

public class Test {
    public static void test(int[][] array){
        Sort.sort(array, true, new SumMaxComparator());
        System.out.println("Sorted by INCREASE sum row of jagged array:\n" + PrintJagged.print(array));

        Sort.sort(array, false, new SumMaxComparator());
        System.out.println("Sorted by WANING sum row of jagged array:\n" + PrintJagged.print(array));

        Sort.sort(array, true, new MaxElementComparator());
        System.out.println("Sorted by INCREASE max element row of jagged array:\n" + PrintJagged.print(array));

        Sort.sort(array, false, new MaxElementComparator());
        System.out.println("Sorted by WANING max element row of jagged array:\n" + PrintJagged.print(array));

        Sort.sort(array, true, new MinElementComparator());
        System.out.println("Sorted by INCREASE min element row of jagged array:\n" + PrintJagged.print(array));

        Sort.sort(array, false, new MinElementComparator());
        System.out.println("Sorted by WANING min element row of jagged array:\n" + PrintJagged.print(array));
    }
}
