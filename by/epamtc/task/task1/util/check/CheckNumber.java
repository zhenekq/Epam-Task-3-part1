package by.epamtc.task.task1.util.check;

public class CheckNumber {
    public static boolean isDigit(String str){
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public static boolean isPrime(int number){
        if (number < 2)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isDifferentThreeDigitNumbers(int number){
        int firstDigit = number % 1000 / 100;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 10;

        boolean isDifferent = firstDigit != secondDigit &&
                firstDigit != thirdDigit &&
                secondDigit != thirdDigit;
        return isDifferent;
    }

    public static boolean isFibNumber(int number){
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
}
