package Intensive.lesson4;

public class Dogs extends Animals {
    Dogs(String name){
    super(name);
}

    @Override
    public void run(int r){
        if(r <= 500){
            System.out.println(name + " пробежал" + r + "м.");
        }
        else{
            System.out.println(name + " не может столько пробежать");
        }
    }

    @Override
    public void swim(int s){
        if(s <= 10){
        System.out.println(name + " проплыл " + s + "м.");
    }
        else {
            System.out.println(name + " не может столько проплыть");
        }

    }
}