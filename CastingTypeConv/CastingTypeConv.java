public class CastingTypeConv {
    public static void main(String[] args) {
        // short x = 1;
        // int y = x + 2;
        // System.out.println(y); // implicit casting byte > short > int > long

        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);
    }
}
