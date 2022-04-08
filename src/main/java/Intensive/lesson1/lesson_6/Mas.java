package Intensive.lesson1.lesson_6;

public class Mas {
    public static void main(String[] args) {
        String[][] rightValues = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] falseSize = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };
        String[][] falseData = {
                {"1", "2", "la", "4"},
                {"5", "6", "7", "8"},
                {"9", "t4", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            Mas.stringExceptionTest(rightValues);
            Mas.stringExceptionTest(falseSize);

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(sum(rightValues));
            System.out.println(sum(falseData));
        } catch (MyArrayDataException exception) {
            exception.printStackTrace();
        }
    }

    public static void stringExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("incorrect number of attachments");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("incorrect second number of attachments"));
            for (int a = 0; a < arr[i].length; a++) {
                System.out.print(arr[i][a]);
            }
            System.out.println();
        }
    }

    private static int sum(String[][] matrix) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                try {
                    sum += Integer.parseInt(matrix[i][a]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, a);
                }
            }
        }
        return sum;
    }
}
