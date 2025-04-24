package lambda.functionalinterfaces;


import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<Integer> consumer = x -> System.out.println(x*100);
        consumer.accept(1);

        Consumer<List<Integer>> printList = list -> {
            list.forEach(consumer);
        };
        printList.accept(List.of(1,2,3,4,5));

        Consumer<List<Integer>> printEvenList = list -> {
            list.forEach(num -> {
                if(num%2==0){
                    System.out.println(num);
                }
            });
        };
        printEvenList.accept(List.of(1,2,3,4,5));

    }
}
