package by.epamtc.task.task2.run;

import by.epamtc.task.task2.util.test.Test;

public class Main {
    public static void main(String[] args) {
        int[][] jaggedArray = {{1, 2, 3},
                              {10, 11, 12, 13, 14},
                              {4, 5, 6, 7},
                              {8, 9},
                              {15, 16, 17, 18}};
        Test.test(jaggedArray);
    }
}
