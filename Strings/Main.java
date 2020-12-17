public class Main {
    public static void main(String[] args) {
        String message = new String("Hello!"); // Can do this like this, but it's redundant

        String betterMessege = "Hello world!" + " Another text!";
       
        System.out.println(betterMessege);
        System.out.println(betterMessege.endsWith("$$$"));
        System.out.println(betterMessege.length());
        System.out.println(betterMessege.indexOf("A"));
        System.out.println(betterMessege.replace("Ano", "%$#"));
        System.out.println(betterMessege.toLowerCase());
    }
}
