package by.epamtc.task.task1.util;

import by.epamtc.task.task1.util.fill.FillArray;
import by.epamtc.task.task1.util.sort.SortBubble;
import by.epamtc.task.task1.util.sort.Sorting;
import by.epamtc.task.task1.util.subarrays.SubArray;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;

public class Array {

    private int[] array;

    public Array() {
        this.array = new int[0];
    }

    public Array(int amountOfElements) {
        if (amountOfElements < 0) {
            //exception
        }
        this.array = new int[amountOfElements];
    }

    public Array(Array array){
        if(array == null) {
            //exception
        }
        this.array = array.getArray();
    }

    private boolean isSorted() {
        int sorted = 0;
        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] <= this.array[i + 1]) {
                sorted++;
            }
        }
        if (sorted == this.array.length - 1)
            return true;
        return false;
    }

    public int[] getArray() {
        return array;
    }

    public int getAmountOfElements(){
        return array.length;
    }

    public void fill(FillArray fillArray) throws FileNotFoundException {
        fillArray.fill(this.array);
    }

    public void sort(Sorting sorting){
        sorting.sortArray(this.array);
    }

    public int BinaryFindElement(int element) {
        if (!isSorted()) {
            sort(new SortBubble());
        }
        int left = 0;
        int right = this.array.length;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (array[mid] > element) right = mid;
            else left = mid + 1;
        }

        right--;

        if (array[right] == element)
            return right;
        return -1;
    }

    public int min() {
        int min = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int max() {
        int max = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (max < this.array[i]) {
                max = this.array[i];
            }
        }
        return max;
    }

    public int[] getSubArray(SubArray subArray){
        return subArray.getSubArray(this.array);
    }

    private StringBuilder printArray() {
        StringBuilder thisArray = new StringBuilder("[");
        for (int i = 0; i < this.array.length; i++) {
            if (i == this.array.length - 1) {
                thisArray.append(this.array[i]);
                break;
            }
            thisArray.append(this.array[i]).append(", ");
        }
        thisArray.append("]");
        return thisArray;
    }

    private boolean equals(Array firstArray, Array secondArray) {
        if (firstArray == null || secondArray == null) {
            //exception
        }
        int[] array = firstArray.getArray();
        int[] array1 = secondArray.getArray();

        for (int i = 0; i < firstArray.getAmountOfElements(); i++) {
            if (array[i] != array1[i])
                return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return array.length == array1.getAmountOfElements() && equals(this, array1);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(array);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n array = " + Arrays.toString(array) +
                "\n}";
    }

    public String toString(int[] array) {
        if (array == null) {
            //exception
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                stringBuilder.append(array[i]);
                break;
            }
            stringBuilder.append(array[i]).append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
