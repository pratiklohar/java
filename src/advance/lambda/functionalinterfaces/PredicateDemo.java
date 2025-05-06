package advance.lambda.functionalinterfaces;


import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 9);

        //Predicate Example.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        for (int num : numbers) {
            if (isEven.test(num)) {
                System.out.println(num);
            }
        }
        Predicate<String> startsWithP = s -> s.startsWith("P");
        Predicate<String> endsWithK = s -> s.endsWith("R");
        Predicate<String> and = startsWithP.and(endsWithK);
        Predicate<String> or = startsWithP.or(endsWithK);
        System.out.println(and.test("PRATIK"));
        System.out.println(or.test("PRATIK"));
        System.out.println(or.negate().test("PRATIK"));

        //BiPredicate Example.
        BiPredicate<Integer, String> biPredicate = (x,y) -> x % 2 == 0 && x == y.length();
        System.out.println(biPredicate.test(6,"PRATIK"));
    }
}

