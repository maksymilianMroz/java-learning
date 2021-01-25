import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1231413.432);
        // System.out.println(result);

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result = percent.format(0.1);
        // System.out.println(result);

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
