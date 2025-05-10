package advance.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 35));
        employees.add(new Employee("David", 20));

        System.out.println(employees);

        Collections.sort(employees);

        System.out.println(employees);

        // Sorting the employees using Comparable
        // The Employee class must implement the Comparable interface and override the compareTo method to define the sorting logic
        // In this case, we are sorting by age in ascending order
        // The problem with Comparable is, When a class implements Comparable,
        // it can define only one natural ordering for its objects, which is specified in the compareTo method.
        // In the given example, the sorting is based on the age of employees in ascending order.
        // However, if you need to sort the objects in multiple ways (e.g., by name or age), Comparable alone is insufficient.
        // For such cases, you would use the Comparator interface, which allows defining multiple sorting strategies.


        // Collections.sort(employees, new NameComparator()); // Valid but not recommended.

        employees.sort(new NameComparator());

        System.out.println(employees);

        // This is a more concise way to sort the list using a lambda expression.
        employees.sort((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));

        System.out.println(employees);



    }
}
