import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;

/**
 * TODO: Add a class header comment!
 */
@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {

    private final static String VALID_WORD = "Cats";

    private static final Object getWords() {
        return new Object[]{
                new Object[]{"Hello"},
                new Object[]{"MyBallsHurt"}
        };
    }
    @Test
    @Parameters(method = "getWords")
    public void shouldReverseWord(String word) {
        StringReverse reverse = new StringReverse(word);
        assertEquals(reverse.reverse(word), reverse.reverse(word));
    }

    private static final Object[] getInvalidWord() {
        return new String[][] {{null}, {""}};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidWord")
    public void constructorShouldThrowIAE (String invalidWord) {
        StringReverse reverse = new StringReverse(invalidWord);
    }

}