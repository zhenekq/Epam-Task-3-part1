package by.epamtc.task.task1.util.fill;

import by.epamtc.task.task1.util.check.CheckNumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FillFromFile implements FillArray {
    @Override
    public void fill(int[] array) throws FileNotFoundException {
        System.out.print("Enter the name of file: ");
        Scanner scanner1 = new Scanner(System.in);
        String fileReader = scanner1.nextLine();
        FileReader fileReader1 = new FileReader(fileReader);
        String line = "";
        Scanner scanner = new Scanner(fileReader1);
        String[] lines = new String[array.length];
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            lines = line.split(" ");
        }
        int index = 0;
        if (array.length > lines.length) {
            for (int i = 0; i < lines.length; i++) {
                if (CheckNumber.isDigit(lines[i])) {
                    array[index] = Integer.parseInt(lines[i]);
                    index++;
                }
            }
        } else {
            for (int i = 0; i <= lines.length; i++) {
                if (CheckNumber.isDigit(lines[i])) {
                    array[index] = Integer.parseInt(lines[i]);
                    index++;
                    if (index == array.length)
                        break;
                }
            }
        }
    }
}
