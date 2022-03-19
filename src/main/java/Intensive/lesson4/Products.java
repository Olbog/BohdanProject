package Intensive.lesson4;

public class Products extends Payment {

    private String lemons = "lemons";
    private int countLemon;
    private String apples = "apples";
    private int countApples;
    private String milk = "milk";
    private int countMilk;


    public Products(int countLemon, int countApples, int countMilk){
    this.countLemon = countLemon;
    this.countApples = countApples;
    this.countMilk = countMilk;
    }


    public void setLemons(String lemons) {
        this.lemons = lemons;
    }

    public void setCountLemon(int countLemon) {
        this.countLemon = countLemon;
    }

    public void setApples(String apples) {
        this.apples = apples;
    }

    public void setCountApples(int countApples) {
        this.countApples = countApples;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public void setCountMilk(int countMilk) {
        this.countMilk = countMilk;
    }

    public String getLemons() {
        return lemons;
    }

    public int getCountLemon() {
        return countLemon;
    }

    public String getApples() {
        return apples;
    }

    public int getCountApples() {
        return countApples;
    }

    public String getMilk() {
        return milk;
    }

    public int getCountMilk() {
        return countMilk;
    }


    public void Prod() {
        System.out.println(" клава");
    }



    @Override
    public String toString(){
        return (" Вы купили: " + "\n" + countLemon + " " + lemons + "\n" + countApples + " " + apples + "\n"
                + countMilk + " " + milk);
    }
}
