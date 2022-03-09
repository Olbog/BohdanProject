package Work.lesson1;

import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = sc.nextLine();
        System.out.println(a);
        sc.close();
    }
}

