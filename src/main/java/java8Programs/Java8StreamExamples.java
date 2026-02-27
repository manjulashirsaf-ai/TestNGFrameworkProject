package java8Programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamExamples {

    public static void main(String[] args) {

        // Sample data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 4, 6);
        String text = "java streams";

        // 1️⃣ Filter even numbers using Stream
        System.out.println("1️⃣ Even numbers:");
        List<Integer> evenNumbers =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println();

        // 2️⃣ Find duplicate elements using Stream
        System.out.println("2️⃣ Duplicate elements:");
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates =
                numbers.stream()
                       .filter(n -> !seen.add(n))
                       .collect(Collectors.toSet());
        System.out.println(duplicates);
        System.out.println();

        // 3️⃣ Sort list using Lambda
        System.out.println("3️⃣ Sort list using Lambda:");
        List<Integer> sortedAsc = numbers.stream()
                                         .sorted((a, b) -> a - b)
                                         .collect(Collectors.toList());
        System.out.println("Ascending: " + sortedAsc);

        List<Integer> sortedDesc = numbers.stream()
                                          .sorted((a, b) -> b - a)
                                          .collect(Collectors.toList());
        System.out.println("Descending: " + sortedDesc);
        System.out.println();

        // 4️⃣ Find max and min using Stream
        System.out.println("4️⃣ Max and Min:");
        int max = numbers.stream().max(Integer::compareTo).get();
        int min = numbers.stream().min(Integer::compareTo).get();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println();

        // 5️⃣ Count characters using Stream
        System.out.println("5️⃣ Character count:");
        Map<Character, Long> charCount =
                text.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(
                            Function.identity(),
                            Collectors.counting()
                    ));
        System.out.println(charCount);
        System.out.println();

        // 6️⃣ Convert List to Map
        System.out.println("6️⃣ Convert List to Map:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Map<Integer, String> nameMap =
                names.stream()
                     .collect(Collectors.toMap(
                             String::length,   // key
                             name -> name,     // value
                             (oldVal, newVal) -> oldVal // handle duplicate keys
                     ));

        System.out.println(nameMap);
    }
}

