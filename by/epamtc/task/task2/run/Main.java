package by.epamtc.task.task2.run;

import by.epamtc.task.task2.util.JaggedArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] amount = {2, 3, 10, 1};
        JaggedArray jaggedArray = new JaggedArray(4, amount);*/
        JaggedArray jaggedArray = new JaggedArray(3,new int[]{1,2,3});
        System.out.println(jaggedArray);
        jaggedArray.fillExistsEmpty();
        System.out.println(jaggedArray);
        jaggedArray.sortByMinOfRowsFromLowToHigh();
        System.out.println(jaggedArray);
        /*Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int array[][] = new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.print("Enter amount of elements in " + (i + 1) + " column:");
            int cols = scanner.nextInt();
            array[i] = new int[cols];
        }

        for(int i=0;i<rows;i++){
            System.out.print((i+1) + " line is: ");
            for(int j=0;j<array[i].length;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
