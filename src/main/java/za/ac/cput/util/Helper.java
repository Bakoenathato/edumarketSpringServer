package za.ac.cput.util;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty())
            return true;
        return false;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isZero(int id){
        if (id == 0)
            return true;
        return false;
    }

    public static boolean isValidEmail(String emailAddress) {
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public static boolean isValidPassword(String password){
        String regexPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static Integer tryParse(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static boolean isInvalidPhoneNumber(String s){
        if (isNullOrEmpty(s) || s.length() != 10 || tryParse(s) == null)
            return true;
        return false;
    }

    public static boolean isInvalidStreetNum(String s){
        if (isNullOrEmpty(s) || s.length() > 6 || s.equals("0") || tryParse(s) == null)
            return true;
        return false;
    }

    public static  boolean isInvalidAddressComponent(String s){
        if (isNullOrEmpty(s) || s.length() > 25)
            return true;
        return false;
    }

    public static boolean isInvalidPostalCode(String s){
        if (isNullOrEmpty(s) || s.length() != 4 || tryParse(s) == null)
            return true;
        return false;
    }

    public static  boolean isInvalidName(String s){
        if (isNullOrEmpty(s) || s.length() < 3 || s.length() > 25)
            return true;
        return false;
    }

}