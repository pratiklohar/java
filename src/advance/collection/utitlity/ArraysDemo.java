package advance.collection.utitlity;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Arrays.sort(arr); // Sort the array

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 30)); // Binary search for an element

        Arrays.fill(arr, 100); // Fill the array with a specific value

        System.out.println(Arrays.toString(arr));

        int[] arr_copy = Arrays.copyOf(arr, arr.length); // Copy the array

        System.out.println(Arrays.toString(arr_copy));

        Integer[] integers = {10, 20, 30, 40, 50};

        List<Integer> list = Arrays.asList(integers); // Convert the array to a list

        System.out.println(list);


    }
}
