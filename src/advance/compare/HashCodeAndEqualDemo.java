package advance.compare;

public class HashCodeAndEqualDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 30);
        Employee e2 = new Employee("Alice", 20);

        System.out.println(e1.equals(e2));
        System.out.println(e1==e2);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
