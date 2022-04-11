package intensive.lesson_8;

import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;

public class Words {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList(
                "Doctor", "Driver", "Doctor", "Builder", "Hairdresser",
                "Lawyer", "Driver", "Hairdresser", "Seller", "Banker",
                "Policeman", "Firefighter", "Seller", "Firefighter", "Banker",
                "Mayor", "Mayor", "Seller", "Firefighter", "Hairdresser"
        );

        Set<String> unique = new HashSet<String>(arr);

        System.out.println("Unique words: ");
        System.out.println(unique.toString());
        System.out.println("Repetitions: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(arr, key));
        }
    }
}
