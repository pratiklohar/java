package lambda.functionalinterfaces;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        Supplier<List<Integer>> supplyIntegerList = () -> List.of(1,2,3,4,5);
        System.out.println(supplyIntegerList.get());
    }
}
