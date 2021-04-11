package by.epamtc.task.task1.util;

public class WrongAmountException extends Exception {
    private int amountOfNumbers;

    public int getAmountOfNumbers() {
        return amountOfNumbers;
    }
    public WrongAmountException(String message, int amountOfNumbers){
        super(message);
        this.amountOfNumbers = amountOfNumbers;
    }
}
