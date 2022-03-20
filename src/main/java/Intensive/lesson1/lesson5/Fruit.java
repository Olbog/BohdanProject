package Intensive.lesson1.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruit {
    public static void main(String args[]) {
        Integer[] arr = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        swapElements(arr, 0, 1);
        ArrayList<Integer> arrayList = arrToArrayList(arr);

        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxForApple = new Box();
        Box<Orange> boxForOrange1 = new Box();
        Box<Orange> boxForOrange2 = new Box();
        for(int i = 0; i < 3; i++){
            boxForOrange1.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            boxForApple.add(new Apple());
        }
        for (int i = 0; i < 4; i++) {
            boxForOrange2.add(new Orange());
        }

        boxForApple.info();
        boxForOrange1.info();
        boxForOrange2.info();

        Float appleWeigth = boxForApple.getWeight();
        Float orangeWeigth1 = boxForOrange1.getWeight();
        Float orangeWeigth2 = boxForOrange2.getWeight();

        System.out.println("Apple weight: " + appleWeigth);
        System.out.println("Orange1 weight: " + orangeWeigth1);
        System.out.println("Orange2 weight: " + orangeWeigth2);

        System.out.println("OrangeBox1 + appleBox: " + boxForOrange1.compare(boxForApple));
        System.out.println("OrangeBox2 + appleBox: " + boxForOrange2.compare(boxForApple));

        boxForOrange1.moveAt(boxForOrange2);

        boxForApple.info();
        boxForOrange1.info();
        boxForOrange2.info();
    }

    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    private static void swapElements(Object[] _array, int num1, int num2) {
        Object arrays = _array[num1];
        _array[num1] = _array[num2];
        _array[num2] = arrays;
    }

    private static <T> ArrayList<T> arrToArrayList(T[] _array) {
        return new ArrayList<T>(Arrays.asList(_array));
    }
}
