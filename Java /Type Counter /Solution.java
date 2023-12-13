import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    private static boolean isString(String str) {
        return str.matches("[a-zA-Z]+");
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void typeCounter(String sentence) {
        String[] substrings = sentence.split("\\s+");

        int stringCount = 0;
        int doubleCount = 0;
        int integerCount = 0;

        for (String substring : substrings) {
            for (char ch : substring.toCharArray()) {
                if (Character.isLetter(ch)) {
                    stringCount++;
                    break;  // Move to the next substring
                } else if (ch == '.') {
                    doubleCount++;
                    break;  // Move to the next substring
                }
            }

            // If the substring contains only digits and no '.', count as integer
            if (substring.chars().allMatch(Character::isDigit)) {
                integerCount++;
            }
        }

        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }
}

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            //System.out.println("Enter a sentence:");
            String sentence = bufferedReader.readLine();
            Result.typeCounter(sentence);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
}            
