import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Implement this method
        int sum = 0;
        for (int i : L) {
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Implement this method
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer i : L) {
            if (i % 2 == 0) evenNumbers.add(i);
        }
        return evenNumbers;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Implement this method
        Set<Integer> s1 = new HashSet<>(L1);
        Set<Integer> resultSet = new HashSet<>();

        for (Integer elm : L2) {
            if (s1.contains(elm)) resultSet.add(elm);
        }
        return new ArrayList<>(resultSet);
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        // TODO: Implement this method
        return 0;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Implement this method
        int count = 0;
        for (String word : words) {
            int originalLength = word.length();
            int newLength = word.replace(String.valueOf(c), "").length();
            count += originalLength - newLength;
        }
        return count;
    }
}
