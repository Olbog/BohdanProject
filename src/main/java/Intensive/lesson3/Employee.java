package Intensive.lesson3;

import java.util.SplittableRandom;

public class Employee {
    public static void main(String[] args) {
        EmployeePerson employeePerson1 = new EmployeePerson("Ivanov Ivan", "Engineer", "lol2@mail.ru", 6743453, 3000, 35);

        EmployeePerson[] mas = new EmployeePerson[5];
        mas[0] = new EmployeePerson("Ivanov Ivan","Engineer","ivanov@mail.ru", 54373465, 3000, 29 );
        mas[1] = new EmployeePerson("Petrov Petr", "Engineer2", "petrov@mail.ru", 58567546, 3100, 32);
        mas[2] = new EmployeePerson("Antonov Anton", "Engineer3", "antonov@mail.ru", 58567146, 3200, 37);
        mas[3] = new EmployeePerson("Sidorov Mark", "Engineer4", "sidorov@mail.ru", 53287146, 3350, 41);
        mas[4] = new EmployeePerson("Izumin Idrak", "Engineer5", "izumin@mail.ru", 57836146, 3500, 43);

        for(int a=0; a < mas.length; a++ ){
            if (mas[a].getAge()>=40){
                System.out.println(mas[a]);
                System.out.println("\n");
            }
        }


    }

}
class EmployeePerson {
    private String fio;
    private String post;
    private String email;
    private int phone;
    private int salary;
    private int age;



    public EmployeePerson(String fio,String post, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    @Override
    public String toString(){
        return (fio + "\n"
                + post + "\n"
                + email + "\n"
                + phone + "\n"
                + salary + "\n"
                + age);
    }

}



