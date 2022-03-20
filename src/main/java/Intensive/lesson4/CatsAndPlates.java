package Intensive.lesson4;

public class CatsAndPlates {
    public static void main(String[] args) {
        Plate plate1 = new Plate(35);
        plate1.info();
        Cat[] Cat = new Cat[3];
        Cat[0] = new Cat("Jack", 20, false);
        Cat[1] = new Cat("Tom", 25, false);
        Cat[2] = new Cat("Bars", 10, false);

        for (int i = 0; i < Cat.length; i++) {
            if (Cat[i].appetite <= plate1.food) {
                Cat[i].eat(plate1);
                Cat[i].more = true;
                System.out.println("Our " + Cat[i].name + " ate " + Cat[i].appetite + " food");
                plate1.info();
            } else {
                System.out.println("Our " + Cat[i].name + " want " + Cat[i].appetite + " food");
            }
        }
        plate1.info();
        plate1.increaseFood(35);
        plate1.info();
        System.out.println();
        System.out.println("cat's fullness:");
        for (int i = 0; i < Cat.length; i++) {
            System.out.println("Our " + Cat[i].name + ", fullness: " + Cat[i].more);
        }
    }
    public static class Cat {
        public String name;
        public int appetite;
        public boolean more = false;

        public Cat(String name, int appetite, boolean more) {
            this.name = name;
            this.appetite = appetite;
            this.more = false;
        }
        public void eat(Plate plate) {
            plate.decreaseFood(appetite);
        }
    }
    public static class Plate {
        public int food;
        public Plate(int food) {
            this.food = food;
        }
        public void info() {
            System.out.println("food in plate: " + food);
        }
        public void decreaseFood(int n) {
            food -= n;
        }
        public void increaseFood(int n) {
            food += n;
            System.out.println("need to add " + n + " еды.");
        }
    }

}
