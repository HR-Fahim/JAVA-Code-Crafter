
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class FormatUsingASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();

        // Format for US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedUS = usFormat.format(payment);

        // Format for Indian currency
        Locale indiaLocale = new Locale("en", "IN");
        String formattedIndia = formatIndianCurrency(payment, indiaLocale);

        // Format for Chinese currency
        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        String formattedChina = chinaFormat.format(payment);

        // Format for French currency
        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        String formattedFrance = franceFormat.format(payment);

        // Print the formatted values
        System.out.println("US: " + formattedUS);
        System.out.println("India: " + formattedIndia);
        System.out.println("China: " + formattedChina);
        System.out.println("France: " + formattedFrance);
    }

	    // Format currency with custom symbol
	    private static String formatCurrency(double amount, Locale locale, String symbol) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        symbols.setCurrencySymbol(String.valueOf((char) 36));
        DecimalFormat df = new DecimalFormat(String.valueOf((char) 164) + " #,##0.00", symbols);
        return df.format(amount);
    }
	    // Format Indian currency
	    private static String formatIndianCurrency(double amount, Locale locale) {
	        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
	        symbols.setCurrencySymbol("Rs.");
	        DecimalFormat df = new DecimalFormat("¤ #,##0.00", symbols);
	        return df.format(amount);
	    }
}
