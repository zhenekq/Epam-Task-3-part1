package by.epamtc.task.task1.util.fill;

import by.epamtc.task.task1.enter.ReadNumber;

import java.io.FileNotFoundException;

public class FillRandom implements FillArray {
    @Override
    public void fill(int[] array) {
        System.out.print("Enter left border: ");
        int leftBorder = ReadNumber.readIntegerNumber();
        System.out.print("Enter right border: ");
        int rightBorder = ReadNumber.readIntegerNumber();
        int minValueOfRange = Math.min(leftBorder, rightBorder);
        int maxValueOfRange = Math.max(leftBorder, rightBorder);
        maxValueOfRange -= minValueOfRange;
        for (int i = 0; i < array.length; i++) {
            int randomValue = (int) (Math.round(Math.random() * maxValueOfRange) + minValueOfRange);// -12 4
            array[i] = randomValue;
        }
    }
}
