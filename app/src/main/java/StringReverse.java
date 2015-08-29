import java.util.ArrayList;
import java.util.List;
/**
 * TODO: Add a class header comment!
 */
public class StringReverse {
    String word;

    public StringReverse(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("invalid word: " + word);
        }
        this.word = word;
    }

    public static String reverse(String s) {
        List<String> tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i + 1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    public String getWord() {
        return word;
    }
}
