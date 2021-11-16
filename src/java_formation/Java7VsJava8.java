package java_formation;

import java.util.stream.IntStream;

public class Java7VsJava8 {

    public static void main(String[] args) {
        //Before
        int total = 0;
        for(int i = 0; i<=50; i++) {
            total += i;
        }
        System.out.println("Total java 7: " + total);

        //After
        int total1 = IntStream.rangeClosed(0, 50) //int i = 0; i<50; i++
                .map(Integer :: new) //for loop
                .sum(); // total += i

        System.out.println("Total java 8: " + total1);
    }


}
