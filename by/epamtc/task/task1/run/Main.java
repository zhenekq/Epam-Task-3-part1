package by.epamtc.task.task1.run;

import by.epamtc.task.task1.enter.EnterArray;
import by.epamtc.task.task1.util.Array;
import by.epamtc.task.task1.util.subarrays.FibNumbers;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Array array = new Array();
        array = EnterArray.enter();
        System.out.println(array);
        System.out.println(array.toString(array.getSubArray(new FibNumbers())));
    }
}
