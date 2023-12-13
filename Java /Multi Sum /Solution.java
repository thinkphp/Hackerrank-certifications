Problem 1:

import java.util.Scanner;

public class Solution {

    // Method to sum elements of an integer array
    public static int sum(int[] array) {
        int result = 0;
        for (int num : array) {
            result += num;
        }
        return result;
    }

    // Method to concatenate strings in a string array
    public static String sum(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String str : array) {
            result.append(str);
        }
        return result.toString();
    }

    // Method to identify and call the appropriate sum method
    public static void processArray(Object array) {
        if (array instanceof int[]) {
            System.out.println(sum((int[]) array));
        } else if (array instanceof String[]) {
            System.out.println(sum((String[]) array));
        } else {
            System.out.println("Unsupported array type");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] strArray = input.split("\\s+");

        // Identify the type of input array and process accordingly
        if (isIntegerArray(strArray)) {
            int[] intArray = convertToIntArray(strArray);
            processArray(intArray);
        } else {
            processArray(strArray);
        }

        scanner.close();
    }

    // Helper method to check if the array is of type Integer
    private static boolean isIntegerArray(String[] array) {
        try {
            for (String element : array) {
                Integer.parseInt(element);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper method to convert a String array to an int array
    private static int[] convertToIntArray(String[] array) {
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }
}            
        }
    }
}
