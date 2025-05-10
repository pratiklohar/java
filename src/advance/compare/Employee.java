package advance.compare;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // In Java, the equals() method is used to compare two objects for equality.
    // Unless you override it, equals() will compare the references(memory address) of the objects, not their content.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee Employee = (Employee) o;
        return age == Employee.age && Objects.equals(name, Employee.name);
    }

    // Overriding hashCode() methode to generate hashcode based on the fields of the object.
    // If both objects are equal, this method will generate same hash code.
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    // The toString() method is used to return a string representation of the object instead of hashCode.
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // Sorting by age in ascending order(natural ordering).
        // If this Employee is less than the specified Employee, return a negative integer.
        // If this Employee is greater than the specified Employee, return a positive integer.
        // If they are equal, return zero.
        // If you want to sort by name, you can use: return this.name.compareTo(o.name);
        // If you want to sort by age in descending order, you can use: return Integer.compare(o.age, this.age);
        return Integer.compare(this.age, o.age);
    }
}
