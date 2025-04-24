package array;

public class Array {
    public static void main(String[] args) {

        int[] arr;              //declaration
        arr = new int[5];       //instantiation (Allocating memory to array)
        arr[0]=1001;            //initialization


        int[] array = new int[10];      // declaring and Allocating memory in one line
        //int []array = new int[10];    // valid
        //int array[] = new int[10];    // valid


        int[] a ={1,2,3};       //declaration, instantiation and initialization


        for (int i = 0; i < arr.length; i++) {      //length property is used to access length of an array.
            arr[i]=i;                               //Inserting element in an array.
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);               // Accessing an element of an array.
        }



        // Multidimensional arrays are used to store the data in a tabular form
        // The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.
        // The array int[][] arr = new int[10][20] can store a total of (10*20) = 200 elements.
        // Similarly, array int[][][] arr = new int[5][10][20] can store total of (5*10*20) = 1000 elements.


        // 2-Dimensional Array

        int rows = 5;
        int columns = 5;

        int[][] array2D = new int[rows][columns];

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
