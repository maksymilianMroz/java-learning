import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Creating an array for 5 items

        numbers[0] = 1;
        numbers[1] = 2;
        // ...
        // numbers[10] = 3; // exepction

        
        System.out.println(numbers); // will show as a chain of characters - place in memory where array was save

        System.out.println(Arrays.toString(numbers)); // Returns an array in [], and if I will not declare items of defined array, they will change to 0
    }
}