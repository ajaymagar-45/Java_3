package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {

    // Email Regex
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    // India Phone Regex
    private static final String INDIA_PHONE_REGEX =
            "^(?:\\+91|0)?[6-9]\\d{9}$";

    // US Phone Regex
    private static final String US_PHONE_REGEX =
            "^(?:\\+1\\s?)?(?:\\(\\d{3}\\)|\\d{3})[-.\\s]?\\d{3}[-.\\s]?\\d{4}$";

    // USD Currency Regex
    private static final String USD_REGEX =
            "^\\$?\\d{1,3}(,\\d{3})*(\\.\\d{2})?$";

    // INR Currency Regex
    private static final String INR_REGEX =
            "^₹?\\d{1,3}(,\\d{2})*(,\\d{3})(\\.\\d{2})?$";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter India Phone: ");
        String indiaPhone = scanner.nextLine();

        System.out.print("Enter US Phone: ");
        String usPhone = scanner.nextLine();

        System.out.print("Enter USD Currency: ");
        String usd = scanner.nextLine();

        System.out.print("Enter INR Currency: ");
        String inr = scanner.nextLine();

        System.out.println("\n===== Validation Results =====");

        System.out.println("Email valid: " +
                Pattern.matches(EMAIL_REGEX, email));

        System.out.println("India Phone valid: " +
                Pattern.matches(INDIA_PHONE_REGEX, indiaPhone));

        System.out.println("US Phone valid: " +
                Pattern.matches(US_PHONE_REGEX, usPhone));

        System.out.println("USD valid: " +
                Pattern.matches(USD_REGEX, usd));

        System.out.println("INR valid: " +
                Pattern.matches(INR_REGEX, inr));

        scanner.close();
    }
}
