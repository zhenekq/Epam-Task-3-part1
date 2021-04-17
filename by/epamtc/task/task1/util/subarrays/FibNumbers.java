package by.epamtc.task.task1.util.subarrays;

import by.epamtc.task.task1.util.check.CheckNumber;

public class FibNumbers implements SubArray {
    @Override
    public int[] getSubArray(int[] array) {
        int[] helpArrayOfThreeDigitNumbers = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (CheckNumber.isFibNumber(array[i])) {
                helpArrayOfThreeDigitNumbers[index] = array[i];
                index++;
            }
        }
        int[] arrayOfThreeDigitNumbers = new int[index];
        for (int i = 0; i < index; i++) {
            arrayOfThreeDigitNumbers[i] = helpArrayOfThreeDigitNumbers[i];
        }
        return arrayOfThreeDigitNumbers;
    }
}
