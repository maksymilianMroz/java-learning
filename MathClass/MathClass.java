public class MathClass {
    public static void main(String[] args) {
        int roundEx = Math.round(1.1F);
        System.out.println(roundEx);
        System.out.println("#########");

        int ceilEx = (int) Math.ceil(1.1F);
        System.out.println(ceilEx);
        System.out.println("#########");

        int floorEx = (int) Math.floor(1.1F);
        System.out.println(floorEx);
        System.out.println("#########");

        int maxEx = (int) Math.max(123, 321); // Bigger number
        System.out.println(maxEx);
        System.out.println("#########");

        int minEx = (int) Math.min(123, 321); // Smaller number
        System.out.println(minEx);
        System.out.println("#########");

        double randomEx = Math.random(); // random number between 0 - 1
        System.out.println(randomEx);
        System.out.println("#########");

        double randomHundEx = Math.random() * 100; // random number between 0 - 100
        System.out.println(randomHundEx);
        System.out.println("#########");

        int combResult = (int) Math.round(Math.random() * 100);
        System.out.println(combResult);
        System.out.println("#########");
    }
}
