package intensive.lesson_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TelephoneDirectory {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Black", "58-99-874");
        telephoneDirectory.add("Black", "18-14-419");
        telephoneDirectory.add("Aganisyan", "88-54-237");
        telephoneDirectory.add("Depp", "28-99-257");
        telephoneDirectory.add("Jackson", "12-55-833");
        telephoneDirectory.add("Jackson", "33-48-772");


        System.out.println("Search by last name :");
        System.out.println("Depp");
        System.out.println(telephoneDirectory.get("Depp"));
        System.out.println("Aganisyan");
        System.out.println(telephoneDirectory.get("Aganisyan"));
        System.out.println("Black");
        System.out.println(telephoneDirectory.get("Black"));

    }

    private HashMap<String, List<String>> book;

    public TelephoneDirectory() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Number: %s - Surname: %s", number, surname));
            } else {
                System.out.println(String.format(number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Number: %s - Surname: %s", number, surname));
        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        }
        return null;
    }
}
