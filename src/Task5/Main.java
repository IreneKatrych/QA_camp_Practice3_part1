package Task5;

//using streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String args[]) {

        Integer[] numbers = {1, 4, 7, 34, 45, 1, 14, 85, 52, 96, 78};

        List<Integer> collection = Arrays.asList(numbers);
        Stream streamFromColl = collection.stream();
        System.out.println("Min = " + collection.stream().min(Integer::compareTo).get());
        System.out.println("Max = " + collection.stream().max(Integer::compareTo).get());
        double average = collection.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average().getAsDouble();
        System.out.println("Average = " + average);
        System.out.println("Sorted numbers ");
        collection.stream().sorted().forEach(System.out::println);
        System.out.println("Using filter < 50 ");
        collection.stream().filter(x -> x < 50).forEach(System.out::println);

    }
}
