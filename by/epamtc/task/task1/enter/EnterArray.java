package by.epamtc.task.task1.enter;

import by.epamtc.task.task1.util.Array;
import by.epamtc.task.task1.util.fill.FillFromConsole;
import by.epamtc.task.task1.util.fill.FillFromFile;
import by.epamtc.task.task1.util.fill.FillRandom;

import java.io.FileNotFoundException;

public class EnterArray {
    public static Array enter() throws FileNotFoundException {
        System.out.print("Enter amount of elements in array: ");
        int amountOfElements = ReadNumber.readIntegerNumber();
        boolean amountLowerZero = amountOfElements < 0;
        String errorOfAmount = "Amount of elements can't be lower than zero!";
        amountOfElements = ReadNumber.meetsTheConditionOfAmount(amountOfElements, amountLowerZero,
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
        choice = ReadNumber.meetsTheConditionOfChoice(choice, choiceCondition, errorOfCondition);

        switch (choice) {
            case 1:
                array.fill(new FillFromConsole());
                break;
            case 2:
                array.fill(new FillRandom());
                break;
            case 3:
                array.fill(new FillFromFile());
                break;
        }
        return array;
    }
}
