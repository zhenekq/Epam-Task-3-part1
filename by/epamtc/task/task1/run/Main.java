package by.epamtc.task.task1.run;

import by.epamtc.task.task1.util.Array;
import by.epamtc.task.task1.enter.ReadNumber;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter amount of elements in array: ");

        int amountOfElements = ReadNumber.readIntegerNumber();
        boolean amountLowerZero = amountOfElements < 0;
        String errorOfAmount = "Amount of elements can't be lower than zero!";
        amountOfElements = ReadNumber.MeetsTheConditionOfAmount(amountOfElements, amountLowerZero,
                errorOfAmount);

        Array array = new Array(amountOfElements);
        if (amountOfElements == 0) {
            System.out.println(array);
            System.exit(0);
        }

        System.out.println("How to fill our array?");
        System.out.println("Enter\n \t1 - by keyboard\n \t2 - random values\n\t3 - read from file");
        System.out.print("Your choice is: ");

        int choice = ReadNumber.readIntegerNumber();
        boolean choiceCondition = choice <= 0 || choice > 3;
        String errorOfCondition = "You can choose only from 1, 2, 3!";
        choice = ReadNumber.MeetsTheConditionOfChoice(choice, choiceCondition, errorOfCondition);

        switch (choice) {
            case 1:
                array.fillArrayFromConsole();
                break;
            case 2:
                System.out.print("Enter the left border: ");
                int leftBorder = ReadNumber.readIntegerNumber();
                System.out.print("Enter the right border: ");
                int rightBorder = ReadNumber.readIntegerNumber();
                array.fillArrayRandom(leftBorder, rightBorder);
                break;
            case 3:
                array.fillArrayFromFile();
                break;
        }
        Array array1 = new Array(array);
        System.out.println(array);
        System.out.println(array1);

    }
}
