package Work.lesson1;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        int[]mas2 = new int [] {5,6,3,8,4,5,6,1,9,4};
        quickSort(mas2, 0, mas2.length - 1);
    }
    public static void quickSort(int[] mas, int leftBord, int rightBord ){
        int leftMark = leftBord;
        int rightMark = rightBord;
        int pivot = mas[(leftMark + rightMark) /2];
        do{
            while (mas[leftMark] < pivot){
                leftMark ++;
            }
            while (mas[rightMark] > pivot){
                rightMark ++;
            }
            if(leftMark >= rightMark){
                if(leftMark > rightMark){
                    int b = leftMark;
                    leftMark = rightMark;
                    rightMark = b;
                }
                leftMark ++;
                rightMark --;
            }
        } while (leftMark > rightMark);
        if (leftMark > rightMark){
            quickSort(mas, leftMark, rightBord);
        }
        if (leftBord > rightMark){
            quickSort(mas, leftBord, rightMark);
        }
        for (int i = 0; 0 < mas.length; i++)
            System.out.println(mas[i]);

    }
}
