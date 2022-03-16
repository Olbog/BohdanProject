package Intensive.lesson4;

public class Animals {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Jon");
        Dogs dog1 = new Dogs("Kim");
        dog1.swim(5);
    }

    String name;


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

