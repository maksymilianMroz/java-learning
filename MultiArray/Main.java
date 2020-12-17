import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] numbers = new int[2][3]; // Init for multi-dimensional array

        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] newArrayNumbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // New way of creating multi-dimensional array
        System.out.println(Arrays.deepToString(newArrayNumbers));
    }
}
