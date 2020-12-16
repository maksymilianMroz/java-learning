public class PrimitiveVariables {
    public static void main(String[] args) {
        
        // Primitive types
        byte myByte = 12; // [-128, 127] B:1
        short myShort = 10234; // [-32k, 32k] B:2
        int myAge = 28_321_321; // [-2b, 2b] B:4
        long veryBigNumbers = 38903892L; // [??] B: 8

        // number with decimal point
        float variableName; // B: 4
        float price = 10.99F;

        double anotherNameForVariable; // B:8

        char singleCharacter = 'a'; // B:2
        char letter = 'A';

        boolean isThere = true; // Only true:1 and false:0
        
        System.out.println(myByte);

    }
}