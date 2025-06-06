package advance.compare;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // Compare by name
        return o1.getName().compareTo(o2.getName());
    }
}
