package java_formation.FunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class _Function {

    static Function<String, Integer>  f1 = name -> name.length();
    static Function<List<Person>, Map<String, Double>> f2 = persoonList -> {
    Map<String, Double> map = new HashMap<String, Double>();
    persoonList.forEach(person -> map.put(person.name, 15000.02554));
        return map;
    };

    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("dihia"),
                new Person("nudia"),
                new Person("dkarimaa")
                );
        Map<String, Double> map = f2.apply(list);
        System.out.println("Result is: " + map);
    }

}
