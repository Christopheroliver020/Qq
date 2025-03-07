
import java.util.*;

public class Qq{
    public static void main(String[] args) {
        String[] names = {"David", "Anna123", "Michael", "Sarah", "John", "Zane", "O'Brien"};

        // Filter out names with non-alphabetic characters
        String[] filteredNames = new String[names.length];
        int count = 0;
        for (String name : names) {
            if (name.matches("[a-zA-Z]+")) {
                filteredNames[count++] = name;
            }
        }
        filteredNames = Arrays.copyOf(filteredNames, count);

        // Sort names based on the sum of the positions of each letter in the alphabet
        for (int i = 0; i < filteredNames.length - 1; i++) {
            for (int j = i + 1; j < filteredNames.length; j++) {
                int sum1 = 0, sum2 = 0;
                for (char c : filteredNames[i].toLowerCase().toCharArray()) {
                    sum1 += c - 'a' + 1;
                }
                for (char c : filteredNames[j].toLowerCase().toCharArray()) {
                    sum2 += c - 'a' + 1;
                }
                if (sum1 < sum2) {
                    String temp = filteredNames[i];
                    filteredNames[i] = filteredNames[j];
                    filteredNames[j] = temp;
                }
            }
        }

        // Print the sorted names
        for (String name : filteredNames) {
            System.out.println(name);
        }
    }
}
