package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    @Test
    public void elementsAreNotNull() throws Exception {
        // empty list
        assertIsNoneNull();

        // only one object
        assertIsAnyNull((Object) null);
        assertIsNoneNull(1);
        assertIsNoneNull("a");
        assertIsNoneNull("abc");

        // list of only one null
        assertIsAnyNull(1, null, 2);
        assertIsAnyNull(null, "abc", 2);

        // list of more than one null
        assertIsAnyNull(null, null, 1);
        assertIsAnyNull(2, new Integer(2), null);
        assertIsNoneNull(1,2,3,4,5);

    }

    private void assertIsAnyNull(Object... objects) { assertTrue(Utils.isAnyNull(objects)); }

    private void assertIsNoneNull (Object... objects) { assertFalse(Utils.isAnyNull(objects)); }
}
