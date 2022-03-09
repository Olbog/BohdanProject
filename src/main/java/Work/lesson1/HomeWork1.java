package Work.lesson1;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        int[]mas2 = new int [] {5,6,3,8,4,5,6,1,9,4};
        System.out.println(arrayToString(mas2));
        quickSort(mas2, 0, mas2.length - 1);
    }
    private static void quickSort(int[] mas, int leftBord, int rightBord ){
        if(leftBord < rightBord){
            int divideIndex = partition(mas,leftBord, rightBord);
            printSortStep(mas,leftBord, rightBord, divideIndex);
            quickSort(mas, leftBord, divideIndex - 1);
            quickSort(mas, divideIndex, rightBord);
        }
    }
    private static int partition (int[]mas, int leftBord, int rightBord){
        int leftIndex = leftBord;
        int rightIndex = rightBord;
        int pivot = mas[leftBord];

        while (leftIndex < pivot){
            leftIndex++;
        }
        while (rightIndex > pivot){
            rightIndex --;
        }
        if(leftIndex <= rightIndex){
            swap(mas,rightIndex, leftIndex);
            rightIndex --;
            leftIndex ++;
        }return(leftIndex);
    }
    private static void swap(int[] mas2, int index1, int index2){
        int a = mas2[index1];
        mas2[index1] = mas2[index2];
        mas2[index2] = a;
    }
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    private static void printSortStep(int[] mas, int leftBord, int rightBord, int partitionIndex) {
        System.out.print(arrayToString(mas));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(mas, leftBord, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(mas, partitionIndex, rightBord + 1)) + "\n");
    }
}



        /* int leftMark = leftBord;
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
*/