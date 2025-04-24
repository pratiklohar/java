package lambda.functionalinterfaces;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {
    public static void main(String[] args) {

        //Function Example.
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("Richa"));

        Function<List<Student>, List<Student>> filteredStudents  = students -> {

            List<Student> studentList = new ArrayList<>();
            for (Student student : students){
                 if(getLength.apply(student.getName())>5){
                     studentList.add(student);
                 }
            }
            return studentList;
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Pratik", 28));
        studs.add(new Student("Richa", 29));
        System.out.println(filteredStudents.apply(studs));

        //BiFunction Example.
        BiFunction<String, String, Boolean> equality = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(equality.apply("Richa","pratik"));

        //UnaryOperation used in place of Function<T,R> that accepts and returns data of same type.
        //Instead of writing Function<Integer, Integer> you can write UnaryOperator<Integer>.
        //UnaryOperator Example.
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(10));

        //BinaryOperation used in place of BiFunction<T,U,R> that accepts and returns data of same type.
        //Instead of writing BiFunction<Integer, Integer, Integer> you can write BinaryOperator<Integer>.
        //BinaryOperator Example.
        BinaryOperator<Integer> binaryOperator = (x,y) -> x * y;
        System.out.println(binaryOperator.apply(10,20));

    }
}
