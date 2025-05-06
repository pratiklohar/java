package advance.collection;

public class Generic {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        String[] s = {"a","b","c","d"};
        PrintArray<Integer> printArray = new PrintArray<>();
        printArray.print(a);
        PrintArray<String> printArray2 = new PrintArray<>();
        printArray2.print(s);
    }
}