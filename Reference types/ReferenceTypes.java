import java.util.Date;

import java.util.Date; // Package which import cause od Date.util class

public class ReferenceTypes {
    
    public static void main (String[] args) {
        byte age = 30; // Primitive type

        Date now = new Date(); // now is instance of Date class
        System.out.println(now);

        // Reference types are diffrent than primitive types, casue they store only reference to an object somewhere in the memory(Primitive types store value).
    }

}
