package java_formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7VsJava8Example2 {
    public static void main(String[] args) {
        //Eliminate les doublons
        List<String> names = Arrays.asList("Sam", "Peter", "Billings", "Sam");

        //Before
        List<String> uniqueList = new ArrayList<>();
        for(String name: names) {
            if(!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("Unique List: " + uniqueList);

        //After
        List<String> uniqueValues1 = names.stream() //se contente de les transférer d’une source vers une suite d’opérations
                .distinct()
                .collect(Collectors.toList()); //permet de stocker le résultat dans une liste
        System.out.println("Unique List 2: " + uniqueValues1);


        //Practice
        List<String> animals = Arrays.asList("Rat", "Fox", "Turtle", "Fox");
        List<String> animalsUnique = animals.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Animals without duplication: " + animalsUnique);






    }
}
