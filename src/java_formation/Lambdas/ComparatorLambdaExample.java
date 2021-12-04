package java_formation.Lambdas;

import java.util.Comparator;

public class  ComparatorLambdaExample {
    public static void main(String[] args) {
        //Before
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Comparator 1: " + c1.compare(15, 40));

        //After
        Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
        System.out.println("Comparator 2: " + c2.compare(30, 90));

    }
}
