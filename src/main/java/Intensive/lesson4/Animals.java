package Intensive.lesson4;

public class Animals {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Jon");
        count1++;
        Dogs dog1 = new Dogs("Kim");
        count2++;
        dog1.swim(5);
        System.out.println("Общее кол-во котов: " + count1);
        System.out.println("Общее кол-во собак: " + count2);
        System.out.println("Общее кол-во животных: " + (count1+count2));
    }

    String name;
    static int count1 = 0;
    static int count2 = 0;


    Animals(String name){
        this.name = name;
    }

    public void run(int r){
        System.out.println("бежит");
    }

    public void swim(int s){
        System.out.println("проплыл");
    }

    @Override
    public String toString(){
        return name;
    }
}

