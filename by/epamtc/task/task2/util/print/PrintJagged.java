package by.epamtc.task.task2.util.print;

public class PrintJagged {
    public static StringBuilder print(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                stringBuilder.append(array[i][j]).append(", ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}
