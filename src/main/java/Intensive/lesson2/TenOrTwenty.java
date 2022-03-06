package Intensive.lesson2;

public class TenOrTwenty {
    public static void main(String[] args) {
        System.out.println(Value());
    }
        public static boolean Value() {
            int a = 4;
            int b = 7;
            int c = a + b;
            if (c >= 10 && c <= 20) {
                return true;
            } else {
                return false;
            }
        }
    }