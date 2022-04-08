package Intensive.lesson1.lesson_6;

public class MyArrayDataException extends Exception {
    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные в %d строке, %d столбце", row, col));
    }
}
