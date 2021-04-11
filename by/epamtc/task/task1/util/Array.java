package by.epamtc.task.task1.util;

import by.epamtc.task.task1.enter.ReadNumber;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Array {

    private int[] array;
    private int amountOfElements;
    private boolean isSorted = false;


    public boolean getIsSorted() {
        return this.isSorted;
    }

    private void isSorted() {
        int sorted = 0;
        for (int i = 0; i < this.amountOfElements - 1; i++) {
            if (this.array[i] <= this.array[i + 1]) {
                sorted++;
            }
        }
        if (sorted == this.amountOfElements - 1)
            this.isSorted = true;
    }

    private boolean isDigit(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public Array() {
        this.amountOfElements = 0;
    }

    // CONSTRUCTOR WITH PARAM AMOUNT OF ELEMENTS !
    public Array(int amountOfElements) {
        if (amountOfElements < 0) {
            //exception
        }
        this.amountOfElements = amountOfElements;
        array = new int[this.amountOfElements];
        isSorted();
    }

    public Array(Array array){
        if(array == null) {
            //exception
        }
        this.amountOfElements = array.getAmountOfElements();
        this.isSorted = array.getIsSorted();
        this.array = array.getArray();
    }

    public int[] getArray() {
        if (this.array == null) {
            //exception
        }
        return array;
    }

    public void setArray(int[] array) {
        if (array == null) {
            //exception
        }
        this.array = array;
    }

    public int getAmountOfElements() {
        return amountOfElements;
    }

    public void setAmountOfElements(int amountOfElements) {
        if (amountOfElements < 0) {
            //exception
        }
        this.amountOfElements = amountOfElements;
    }

    // FILL ARRAY START !!!!!!!
    public void fillArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of current array: ");
        for (int i = 0; i < this.amountOfElements; i++) {
            this.array[i] = ReadNumber.readIntegerNumber();
        }
        isSorted();
    }

    public void fillArrayFromFile() throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        String line = "";
        Scanner scanner = new Scanner(fileReader);
        String[] lines = new String[this.amountOfElements];
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            line = line.trim();
            lines = line.split(" ");
        }
        int index = 0;
        if (this.amountOfElements > lines.length) {
            for (int i = 0; i < lines.length; i++) {
                if (isDigit(lines[i])) {
                    this.array[index] = Integer.parseInt(lines[i]);
                    index++;
                }
            }
        } else {
            for (int i = 0; i <= lines.length; i++) {
                if (isDigit(lines[i])) {
                    this.array[index] = Integer.parseInt(lines[i]);
                    index++;
                    if (index == this.amountOfElements)
                        break;
                }
            }
        }
        isSorted();
    }

    public void fillArrayRandom(int leftBorder, int rightBorder) {
        int minValueOfRange = Math.min(leftBorder, rightBorder);
        int maxValueOfRange = Math.max(leftBorder, rightBorder);
        maxValueOfRange -= minValueOfRange;
        for (int i = 0; i < this.amountOfElements; i++) {
            int randomValue = (int) (Math.round(Math.random() * maxValueOfRange) + minValueOfRange);// -12 4
            array[i] = randomValue;
        }
        isSorted();
    }
    // FILL ARRAY END !!!!!!!!!

    //SORTING METHODS START !!!!!!!
    public void sortBubble() {
        this.isSorted = true;
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

    }

    public void sortInsertion() {
        this.isSorted = true;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public void sortSelection() {
        this.isSorted = true;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    public int BinaryFindElement(int element) {
        if (!isSorted) {
            System.out.println("Be careful! Your array isn't sorted!");
            System.out.println("Binary search is better working with sorted array! Sort pls!");
        }
        int left = 0;
        int right = this.amountOfElements;
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
    //SORTING METHODS END !!!!!!!!!

    public int min() {
        int min = this.array[0];
        for (int i = 0; i < this.amountOfElements; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int max() {
        int max = this.array[0];
        for (int i = 0; i < this.amountOfElements; i++) {
            if (max < this.array[i]) {
                max = this.array[i];
            }
        }
        return max;
    }

    //METHODS FOR PRIME, THREE-DIGIT AND FIB NUMBERS
    private boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private boolean isDifferentThreeDigitNumbers(int number) {
        int firstDigit = number % 1000 / 100;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 10;

        boolean isDifferent = firstDigit != secondDigit &&
                firstDigit != thirdDigit &&
                secondDigit != thirdDigit;
        return isDifferent;
    }

    private boolean isFibNumber(int number) {
        if (number < 0) return false;
        if (number == 1) return true;
        int firstElementOfSequence = 1;
        int secondElementOfSequence = 1;
        int nextElementOfSequence = 0;
        while (nextElementOfSequence < number) {
            nextElementOfSequence = firstElementOfSequence + secondElementOfSequence;
            secondElementOfSequence = firstElementOfSequence;
            firstElementOfSequence = nextElementOfSequence;
        }
        return nextElementOfSequence == number;
    }
    // END OF METHODS FOR PRIME, THREE-DIGIT AND FIB NUMBERS

    //METHODS THAT RETURN ARRAY OF PRIME AND FIB NUMBERS
    public int[] primeNumbers() {
        int[] helpArrayOfPrimeNumbers = new int[this.amountOfElements];
        int index = 0;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (isPrime(this.array[i])) {
                helpArrayOfPrimeNumbers[index] = this.array[i];
                index++;
            }
        }
        int[] arrayOfPrimeNumbers = new int[index];
        for (int i = 0; i < index; i++) {
            arrayOfPrimeNumbers[i] = helpArrayOfPrimeNumbers[i];
        }
        return arrayOfPrimeNumbers;
    }

    public int[] differentThreeDigitNumbers() {
        int[] helpArrayOfThreeDigitNumbers = new int[this.amountOfElements];
        int index = 0;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (isDifferentThreeDigitNumbers(this.array[i])) {
                helpArrayOfThreeDigitNumbers[index] = this.array[i];
                index++;
            }
        }
        int[] arrayOfThreeDigitNumbers = new int[index];
        for (int i = 0; i < index; i++) {
            arrayOfThreeDigitNumbers[i] = helpArrayOfThreeDigitNumbers[i];
        }
        return arrayOfThreeDigitNumbers;
    }

    public int[] fibNumbers() {
        int[] helpArrayOfFibNumbers = new int[this.amountOfElements];
        int index = 0;
        for (int i = 0; i < this.amountOfElements; i++) {
            if (isFibNumber(this.array[i])) {
                helpArrayOfFibNumbers[index] = this.array[i];
                index++;
            }
        }
        int[] arrayOfFibNumbers = new int[index];
        for (int i = 0; i < index; i++) {
            arrayOfFibNumbers[i] = helpArrayOfFibNumbers[i];
        }
        return arrayOfFibNumbers;
    }
    //END OF METHODS THAT RETURN ARRAY OF PRIME AND FIB NUMBERS


    private StringBuilder printArray() {
        StringBuilder thisArray = new StringBuilder("[");
        for (int i = 0; i < this.amountOfElements; i++) {
            if (i == this.amountOfElements - 1) {
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
        return amountOfElements == array1.amountOfElements &&
                isSorted == array1.isSorted &&
                equals(this, array1);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(amountOfElements, isSorted);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "Array {" +
                "\n\tarray = " + printArray() +
                ", \n\tamountOfElements = " + amountOfElements +
                ", \n\tisSorted = " + isSorted +
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
