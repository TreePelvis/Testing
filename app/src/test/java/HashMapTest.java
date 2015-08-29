import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

/**
 * TODO: Add a class header comment!
 */
public class HashMapTest {
    HashMap hm;

    @Before
    public void setUp() {
        hm = new HashMap();
    }

    @Test
    public void checkForCorrectObjectWithPutAndGet() {
        hm.put("Cats", "Alot");
        assertEquals("Alot", hm.get("Cats"));
    }

    @Test
    public void shouldReplaceOldOjectWithNew() {
        hm.put("Cats", "Alot");
        assertEquals("Alot", hm.get("Cats"));
        hm.put("Cats", "None");
        assertEquals("None", hm.get("Cats"));
    }

    @Test
    public void shouldClearHashMap() {
        hm.put("Cats", "No Cats");
        hm.clear();
        assertTrue(hm.isEmpty());
    }

    @Test
    public void shouldPlaceNullInHM () {
        hm.put("Milk", null);
        assertNull(hm.get("Milk"));
    }
}
