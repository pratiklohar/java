package advance.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * <h1>Set (Unordered Collection)</h1>
 * <p>Collection of unique elements, hence no duplicates.
 * <p>Does not preserve insertion order of elements, hence elements of set cannot be access by their index.
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
    }
}
