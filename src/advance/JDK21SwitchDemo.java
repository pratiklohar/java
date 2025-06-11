package advance;


public class JDK21SwitchDemo {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    static String dayType(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
        };
    }

    // match types directly in case labels.
    static Object patternMatching(Object obj) {
        return switch (obj) {
            case String s -> "It's a string of length: " + s.length();
            case Integer i -> "It's an integer: " + (i * 2);
            case null -> "It's null";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {


        System.out.println(dayType(Day.MONDAY));
        System.out.println(patternMatching("Hello"));

        record Person(String name, int age) {
        }

        Object input = new Person("Alice", 25);

        // combine with guard conditions (when) for finer control.
        String output = switch (input) {
            case Person p when p.age() >= 18 -> "Adult: " + p.name();
            case Person p -> "Minor: " + p.name();
            default -> "Unknown";
        };
        System.out.println(output);

    }
}
