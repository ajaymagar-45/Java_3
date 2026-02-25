import java.util.stream.IntStream;

public class MissingElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;

        int xor1 = IntStream.rangeClosed(1, n).reduce(0, (a, b) -> a ^ b);
        int xor2 = IntStream.of(arr).reduce(0, (a, b) -> a ^ b);

        int missing = xor1 ^ xor2;

        System.out.println("Missing number: " + missing);
    }
}
