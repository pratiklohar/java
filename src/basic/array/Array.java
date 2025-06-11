package basic.array;

import java.util.Arrays;

/**
 * <h1>Array</h1>
 * <p>An array is a collection of elements of same data type.
 * <p>Multidimensional arrays are used to store the data in a tabular form
 * <p>The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.
 * <p>The array int[][] arr = new int[10][20] can store a total of (10*20) = 200 elements.
 * <p>Similarly, array int[][][] arr = new int[5][10][20] can store total of (5*10*20) = 1000 elements.
 */
public class Array {
    public static void main(String[] args) {

        int[] integerArray = new int[5]; // Initializing an array of size 5

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = i * 10;
        }

        System.out.println(Arrays.toString(integerArray)); // Prints the array

        int[] intArray2 = {1, 2, 3}; // Declaration, Instantiation and Initialization

        int rows = 5;
        int columns = 5;

        int[][] array2D = new int[rows][columns]; // 2-Dimensional Array

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2D[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}
