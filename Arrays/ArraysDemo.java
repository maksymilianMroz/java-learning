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


        int[] anotherArray = {1, 2, 3, 4, 5};
        System.out.println(anotherArray.length);


        int[] anotherArrayToSort = {12, 1, 7, 9999, 321};
        Arrays.sort(anotherArrayToSort);
        System.out.print(Arrays.toString(anotherArrayToSort)); // How to sort our array from lowest to greatest
    }
}