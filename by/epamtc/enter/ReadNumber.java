package by.epamtc.util;

import java.util.Scanner;

public class ReadNumber {


    public static int readIntegerNumber(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Enter the integer value!");
        }
        return scanner.nextInt();
    }
}
