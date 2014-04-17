import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Alexey
 */
public class NumberFinderTest {

    @Test
    public void testFind() throws Exception {
        final int[] data = {565, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -5};
        final NumberFinder numberFinder = new NumberFinder(data);

        assertEquals(6, numberFinder.findIndex(4));
        assertEquals(5, numberFinder.findIndex(5));
        assertEquals(8, numberFinder.findIndex(2));
        assertEquals(2, numberFinder.findIndex(8));
        assertEquals(1, numberFinder.findIndex(9));
        assertEquals(10, numberFinder.findIndex(0));
        assertEquals(7, numberFinder.findIndex(3));
        assertEquals(11, numberFinder.findIndex(-5));
        assertEquals(0, numberFinder.findIndex(565));

        assertEquals(-1, numberFinder.findIndex(10));
        assertEquals(-1, new NumberFinder(null).findIndex(1));
        assertEquals(-1, new NumberFinder(new int[]{}).findIndex(1));
    }
}
