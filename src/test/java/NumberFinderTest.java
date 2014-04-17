import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Alexey
 */
public class NumberFinderTest {

    @Test
    public void testFind() throws Exception {
        final int[] data = {565, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -5};

        assertEquals(6, new NumberFinder(data, 4).findIndex());
        assertEquals(5, new NumberFinder(data, 5).findIndex());
        assertEquals(8, new NumberFinder(data, 2).findIndex());
        assertEquals(2, new NumberFinder(data, 8).findIndex());
        assertEquals(1, new NumberFinder(data, 9).findIndex());
        assertEquals(10, new NumberFinder(data, 0).findIndex());
        assertEquals(7, new NumberFinder(data, 3).findIndex());
        assertEquals(11, new NumberFinder(data, -5).findIndex());
        assertEquals(0, new NumberFinder(data, 565).findIndex());

        assertEquals(-1, new NumberFinder(data, 10).findIndex());
        assertEquals(-1, new NumberFinder(null, 1).findIndex());
        assertEquals(-1, new NumberFinder(new int[]{}, 1).findIndex());
    }
}
