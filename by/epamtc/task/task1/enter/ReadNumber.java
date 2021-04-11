package by.epamtc.task.task1.enter;

import java.util.Scanner;

public class ReadNumber {


    public static int MeetsTheConditionOfAmount(int value, boolean condition, String error) {
        while (condition) {
            System.out.println(error);
            value = ReadNumber.readIntegerNumber();
            condition = value < 0;
        }
        return value;
    }

    public static int MeetsTheConditionOfChoice(int value, boolean condition, String error) {
        while (condition) {
            System.out.println(error);
            value = ReadNumber.readIntegerNumber();
            condition = value <= 0 || value > 3;
        }
        return value;
    }

    public static int readIntegerNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Enter the integer value!");
        }
        return scanner.nextInt();
    }
}
