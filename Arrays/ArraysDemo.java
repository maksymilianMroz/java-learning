public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Creating an array for 5 items

        numbers[0] = 1;
        numbers[1] = 2;
        // ...
        // numbers[10] = 3; // exepction

        
        System.out.println(numbers); // will show as a chain of characters - place in memory where array was save

        Arrays.toString(numbers);

    }
}