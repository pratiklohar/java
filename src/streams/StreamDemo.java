package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Ways to create stream in java.

        //using Stream class.
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        //using list
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10,8,6);
        Stream<Integer> integerStream1 = integerList.stream();

        //using arrays
        int[] arr = {1,2,3,4,5};
        IntStream integerStream2 = Arrays.stream(arr);

        String[] names = {"Alice", "Bob", "Charlie"};
        Stream<String> namesStream = Arrays.stream(names);

        //using iterator
        Stream<Integer> integerStream3 = Stream.iterate(0,x -> x+1).limit(100);

        //using generate
        Stream<Integer> integerStream4 = Stream.generate(()-> (int) Math.random()).limit(5);

        //stream operations
        List<Integer> filteredList = integerList.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->b-a)
                .limit(4)
                .toList();
        System.out.println(filteredList);

    }
}
