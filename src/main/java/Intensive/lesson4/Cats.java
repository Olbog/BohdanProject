package Intensive.lesson4;

public class Cats extends Animals {
    Cats(String name){
        super(name);
    }

    @Override
    public void run(int r){
        if(r <= 200){
            System.out.println(name + " пробежал " + r + "м.");
        }
        else{
            System.out.println(name + " не может столько пробежать");
        }
    }

    @Override
    public void swim(int s){
        System.out.println("К сожалению, коты не умеют плавать");
     }

}