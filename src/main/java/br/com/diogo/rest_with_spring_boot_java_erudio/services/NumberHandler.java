package br.com.diogo.rest_with_spring_boot_java_erudio.services;

public class NumberHandler {

    public static double convertNumber(String strNumber) {
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?\\d*\\.?\\d+");
    }
}
