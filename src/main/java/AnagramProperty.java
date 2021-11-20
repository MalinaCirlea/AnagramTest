import java.util.Arrays;
import java.util.Scanner;

public class AnagramProperty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        String string1 = scanner.nextLine();
        System.out.println("Please enter the second word: ");
        String string2 = scanner.nextLine();

        if (checkAnagramProperty(string1, string2)) {
            System.out.println("The first string: " + string1 + " is anagram of the second string: " + string2);
        } else {
            System.out.println("The given strings are not anagram");
        }

    }

    public static boolean checkAnagramProperty(String string1, String string2) {
        string1 = string1.replaceAll("\\s", "");
        string2 = string2.replaceAll("\\s", "");
        int length1 = string1.length();
        int length2 = string2.length();
        if (length1 == length2) {
            char[] array1 = string1.toLowerCase().toCharArray();
            char[] array2 = string2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            return (Arrays.equals(array1, array2));
        } else {
            return false;
        }
    }
}
