package Intensive.lesson2;

public class Task8 {
    public static void main(String[] args) {
        tasks8();
    }
    public static void tasks8(){
        int arr [][] = new int [5][5];
        for (int i = 0; i <5; i++){
            for(int a = 0; a<5; a++){
                if(i==a){
                    arr[i][a] = 1;
                }
                System.out.println(arr[i][a]);
            }
        }
    }
}
