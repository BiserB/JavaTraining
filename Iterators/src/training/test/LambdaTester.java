package training.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTester {

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays
//                .asList(4, 2, 1, 3, 5, 7, 1, 4 , 2, 12));
//
//        arr.removeIf(num -> num % 2 != 0);
//
//        arr.sort(( i, j) -> i.compareTo(j));
//
//        arr.forEach((num) -> {
//            System.out.print(num + ", ");
//            });
//
//        Function<Integer, Integer> sum = (a) -> a * 2;
//
//        sum.apply(1);

        Integer j = generator().get();

        System.out.println(j);
    }

    public static Supplier<Integer> generator(){
        Supplier<Integer> result = () -> 5;
        return result;
    }


}
