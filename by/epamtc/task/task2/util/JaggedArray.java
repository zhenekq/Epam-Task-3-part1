package by.epamtc.task.task2.util;

import by.epamtc.task.task1.enter.ReadNumber;

import java.util.Arrays;
import java.util.Objects;

public class JaggedArray {
    private int rows;
    private int[] amountOfElementsInRows;
    private int[][] jaggedArray;

    public JaggedArray() {
        this.rows = 0;
    }

    public int getRows() {
        return rows;
    }

    public int[] getAmountOfElementsInRows() {
        if (this.amountOfElementsInRows == null) {
            //exception
        }
        return amountOfElementsInRows;
    }

    public int[][] getJaggedArray() {
        if (this.jaggedArray == null) {
            //exception
        }
        return jaggedArray;
    }

    private void swap(int first, int second) {
        int tmp = first;
        first = second;
        second = tmp;
    }

    private void swap(int[] first, int[] second) {
        int[] tmp = first;
        first = second;
        second = tmp;
    }

    public void sortBySumOfRowFromLowToHigh() {
        if (this.amountOfElementsInRows == null || this.jaggedArray == null) {
            //exception
        }
        int[] arrayOfMaxSum = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            int sum = 0;
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                sum += this.jaggedArray[i][j];
            }
            arrayOfMaxSum[i] = sum;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rows - 1; i++) {
                if (arrayOfMaxSum[i] > arrayOfMaxSum[i + 1]) {
                    int tmp = arrayOfMaxSum[i];
                    arrayOfMaxSum[i] = arrayOfMaxSum[i+1];
                    arrayOfMaxSum[i+1] = tmp;
                    int[] tmp2 = this.jaggedArray[i];
                    this.jaggedArray[i] = this.jaggedArray[i+1];
                    this.jaggedArray[i+1] = tmp2;

                    int tmp3 = this.amountOfElementsInRows[i];
                    this.amountOfElementsInRows[i] = this.amountOfElementsInRows[i+1];
                    this.amountOfElementsInRows[i+1] = tmp3;
                    isSorted = false;
                }
            }
        }
    }
    public void sortBySumOfRowFromHighToLow() {
        if (this.amountOfElementsInRows == null || this.jaggedArray == null) {
            //exception
        }
        int[] arrayOfMaxSum = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            int sum = 0;
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                sum += this.jaggedArray[i][j];
            }
            arrayOfMaxSum[i] = sum;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rows - 1; i++) {
                if (arrayOfMaxSum[i] < arrayOfMaxSum[i + 1]) {
                    int tmp = arrayOfMaxSum[i];
                    arrayOfMaxSum[i] = arrayOfMaxSum[i+1];
                    arrayOfMaxSum[i+1] = tmp;
                    int[] tmp2 = this.jaggedArray[i];
                    this.jaggedArray[i] = this.jaggedArray[i+1];
                    this.jaggedArray[i+1] = tmp2;

                    int tmp3 = this.amountOfElementsInRows[i];
                    this.amountOfElementsInRows[i] = this.amountOfElementsInRows[i+1];
                    this.amountOfElementsInRows[i+1] = tmp3;
                    isSorted = false;
                }
            }
        }
    }

    public void sortByMaxOfRowsFromLowToHigh(){
        if (this.amountOfElementsInRows == null || this.jaggedArray == null) {
            //exception
        }
        int[] arrayOfMaxSum = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            int max = this.jaggedArray[i][0];
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                if(this.jaggedArray[i][j] > max){
                    max = this.jaggedArray[i][j];
                }
            }
            arrayOfMaxSum[i] = max;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rows - 1; i++) {
                if (arrayOfMaxSum[i] > arrayOfMaxSum[i + 1]) {
                    int tmp = arrayOfMaxSum[i];
                    arrayOfMaxSum[i] = arrayOfMaxSum[i+1];
                    arrayOfMaxSum[i+1] = tmp;
                    int[] tmp2 = this.jaggedArray[i];
                    this.jaggedArray[i] = this.jaggedArray[i+1];
                    this.jaggedArray[i+1] = tmp2;

                    int tmp3 = this.amountOfElementsInRows[i];
                    this.amountOfElementsInRows[i] = this.amountOfElementsInRows[i+1];
                    this.amountOfElementsInRows[i+1] = tmp3;
                    isSorted = false;
                }
            }
        }
    }
    public void sortByMaxOfRowsFromHighToLow(){
        if (this.amountOfElementsInRows == null || this.jaggedArray == null) {
            //exception
        }
        int[] arrayOfMaxSum = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            int max = this.jaggedArray[i][0];
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                if(this.jaggedArray[i][j] > max){
                    max = this.jaggedArray[i][j];
                }
            }
            arrayOfMaxSum[i] = max;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rows - 1; i++) {
                if (arrayOfMaxSum[i] < arrayOfMaxSum[i + 1]) {
                    int tmp = arrayOfMaxSum[i];
                    arrayOfMaxSum[i] = arrayOfMaxSum[i+1];
                    arrayOfMaxSum[i+1] = tmp;
                    int[] tmp2 = this.jaggedArray[i];
                    this.jaggedArray[i] = this.jaggedArray[i+1];
                    this.jaggedArray[i+1] = tmp2;

                    int tmp3 = this.amountOfElementsInRows[i];
                    this.amountOfElementsInRows[i] = this.amountOfElementsInRows[i+1];
                    this.amountOfElementsInRows[i+1] = tmp3;
                    isSorted = false;
                }
            }
        }
    }

    public void sortByMinOfRowsFromLowToHigh(){
        if (this.amountOfElementsInRows == null || this.jaggedArray == null) {
            //exception
        }
        int[] arrayOfMaxSum = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            int min = this.jaggedArray[i][0];
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                if(this.jaggedArray[i][j] < min){
                    min = this.jaggedArray[i][j];
                }
            }
            arrayOfMaxSum[i] = min;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rows - 1; i++) {
                if (arrayOfMaxSum[i] > arrayOfMaxSum[i + 1]) {
                    int tmp = arrayOfMaxSum[i];
                    arrayOfMaxSum[i] = arrayOfMaxSum[i+1];
                    arrayOfMaxSum[i+1] = tmp;
                    int[] tmp2 = this.jaggedArray[i];
                    this.jaggedArray[i] = this.jaggedArray[i+1];
                    this.jaggedArray[i+1] = tmp2;

                    int tmp3 = this.amountOfElementsInRows[i];
                    this.amountOfElementsInRows[i] = this.amountOfElementsInRows[i+1];
                    this.amountOfElementsInRows[i+1] = tmp3;
                    isSorted = false;
                }
            }
        }
    }
    public void sortByMinOfRowsFromHighToLow(){
        if (this.amountOfElementsInRows == null || this.jaggedArray == null) {
            //exception
        }
        int[] arrayOfMaxSum = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            int min = this.jaggedArray[i][0];
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                if(this.jaggedArray[i][j] < min){
                    min = this.jaggedArray[i][j];
                }
            }
            arrayOfMaxSum[i] = min;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rows - 1; i++) {
                if (arrayOfMaxSum[i] < arrayOfMaxSum[i + 1]) {
                    int tmp = arrayOfMaxSum[i];
                    arrayOfMaxSum[i] = arrayOfMaxSum[i+1];
                    arrayOfMaxSum[i+1] = tmp;
                    int[] tmp2 = this.jaggedArray[i];
                    this.jaggedArray[i] = this.jaggedArray[i+1];
                    this.jaggedArray[i+1] = tmp2;

                    int tmp3 = this.amountOfElementsInRows[i];
                    this.amountOfElementsInRows[i] = this.amountOfElementsInRows[i+1];
                    this.amountOfElementsInRows[i+1] = tmp3;
                    isSorted = false;
                }
            }
        }
    }

    public JaggedArray(JaggedArray jaggedArray) {
        if (jaggedArray == null || jaggedArray.getAmountOfElementsInRows() == null) {
            //exception
        }
        this.amountOfElementsInRows = jaggedArray.getAmountOfElementsInRows();
        this.rows = jaggedArray.getRows();
        this.jaggedArray = jaggedArray.getJaggedArray();
    }

    public JaggedArray(int rows, int[] amountOfElementsInRows) {
        if (amountOfElementsInRows == null || rows < 0) {
            //exception
        }
        this.rows = rows;
        this.amountOfElementsInRows = new int[rows];
        for (int i = 0; i < rows; i++) {
            this.amountOfElementsInRows[i] = 0;
        }
        for (int i = 0; i < this.amountOfElementsInRows.length; i++) {
            this.amountOfElementsInRows[i] = amountOfElementsInRows[i];
        }
        this.jaggedArray = new int[this.rows][];
        for (int i = 0; i < rows; i++) {
            this.jaggedArray[i] = new int[this.amountOfElementsInRows[i]];
        }
    }

    private void fillLines() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                System.out.print("Enter values of " + (i + 1) + " row: ");
                this.jaggedArray[i][j] = ReadNumber.readIntegerNumber();
            }
        }
    }

    public void fillExistsEmpty() {
        fillLines();
    }

    private void makeZero() {
        if (this.rows < 0) {
            //exception
        }
        this.amountOfElementsInRows = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            this.amountOfElementsInRows[i] = 0;
        }
    }

    public void fill() {
        System.out.print("Enter the number of rows in you jagged array: ");
        this.rows = ReadNumber.readIntegerNumber();
        this.jaggedArray = new int[this.rows][];
        makeZero();
        for (int i = 0; i < this.rows; i++) {
            System.out.print("Enter amount of numbers in " + (i + 1) + " row: ");
            this.amountOfElementsInRows[i] = ReadNumber.readIntegerNumber();
            this.jaggedArray[i] = new int[this.amountOfElementsInRows[i]];
        }
        fillLines();
    }


    private StringBuilder printJagged() {
        StringBuilder juggedString = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                if (j == this.amountOfElementsInRows[i] - 1) {
                    juggedString.append(this.jaggedArray[i][j]);
                    break;
                }
                juggedString.append(this.jaggedArray[i][j]).append(" ");
            }
            juggedString.append("\n");

        }
        return juggedString;
    }

    private StringBuilder printAmountInRow() {
        StringBuilder amountString = new StringBuilder("[");
        for (int i = 0; i < this.rows; i++) {
            if (i == rows - 1) {
                amountString.append(this.amountOfElementsInRows[i]);
                break;
            }
            amountString.append(this.amountOfElementsInRows[i]).append(" ");
        }
        amountString.append("]");
        return amountString;
    }

    private boolean equals(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) {
            //exception
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i])
                return false;
        }
        return true;
    }

    private boolean equals(int[][] firstArray, int[][] secondArray) {
        if (firstArray == null || secondArray == null ||
                this.rows < 0 || this.amountOfElementsInRows == null) {
            //exception
        }
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.amountOfElementsInRows[i]; j++) {
                if (firstArray[i][j] != secondArray[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArray that = (JaggedArray) o;
        return rows == that.rows &&
                equals(this.amountOfElementsInRows, that.amountOfElementsInRows) &&
                equals(this.jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rows);
        result = 31 * result + Arrays.hashCode(amountOfElementsInRows);
        result = 31 * result + Arrays.hashCode(jaggedArray);
        return result;
    }

    @Override
    public String toString() {
        return "JaggedArray {" +
                "\n\trows = " + rows +
                ", \n\tamountOfElementsInRows = "  + printAmountInRow() +
                ", \n\tjaggedArray = \n" + printJagged() +
                "}";
    }
}



