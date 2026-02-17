package StreamPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange",
                "grape", "pineapple");
        String ss=strings.stream().max((s1, s2)->Integer.compare(s1.length(),s2.length())).orElse(null);
        System.out.println(ss);
    }
}
