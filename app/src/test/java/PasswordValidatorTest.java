import org.junit.Test;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidatorTest {

    @Test
    public void constructorShouldSetPassword() {
        PasswordValidator pv = new PasswordValidator("Password123");
        assertEquals("Password123", pv.getPassword());
    }

    private static final Object getValidPasswords() {
        return new Object[]{
                new Object[]{"Rubberband"},
                new Object[]{"mIlkandbEAns"},
                new Object[]{"123paSSword"}
        };
    }

    @Test
    @Parameters(method = "getValidPasswords")
    public void passwordShouldContainAtLeastOneCapitalLetter(String password) {
        PasswordValidator pv = new PasswordValidator(password);
        assertTrue(pv.containsCapitalLetter(password));
    }

    @Test
    @Parameters(method = "getValidPasswords")
    public void passwordShouldContainBetweenSixAndFifteenCharacters(String password) {
        PasswordValidator pv = new PasswordValidator(password);
        assertTrue(pv.containsCorrectCharacterLength(password));
    }

    private static final Object getInvalidPasswords() {
        return new Object[]{
                new Object[]{"cans"},
                new Object[]{" "},
                new Object[]{"hotpotato"}
        };
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidPasswords")
    public void constructorShouldThrowIAE(String password) {
        PasswordValidator pv = new PasswordValidator(password);
    }
}