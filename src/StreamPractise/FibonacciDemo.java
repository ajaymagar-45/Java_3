package StreamPractise;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciDemo {

    public static List<Long> fibonacci(int n) {
        return Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(n)
                .map(f -> f[0])
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        Pattern.compile(",")
                .splitAsStream("apple,banana,orange")
                .forEach(System.out::println);
    }



    }

