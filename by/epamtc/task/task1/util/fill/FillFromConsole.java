package by.epamtc.task.task1.util.fill;

import by.epamtc.task.task1.enter.ReadNumber;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillFromConsole implements FillArray {
    @Override
    public void fill(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of current array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ReadNumber.readIntegerNumber();
        }
    }

}
