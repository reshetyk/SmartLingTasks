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
        assertEquals(3, numberFinder.getCountIterations());

        assertEquals(5, numberFinder.findIndex(5));
        assertEquals(1, numberFinder.getCountIterations());

        assertEquals(8, numberFinder.findIndex(2));
        assertEquals(2, numberFinder.getCountIterations());

        assertEquals(2, numberFinder.findIndex(8));
        assertEquals(2, numberFinder.getCountIterations());

        assertEquals(1, numberFinder.findIndex(9));
        assertEquals(4, numberFinder.getCountIterations());

        assertEquals(10, numberFinder.findIndex(0));
        assertEquals(3, numberFinder.getCountIterations());

        assertEquals(7, numberFinder.findIndex(3));
        assertEquals(4, numberFinder.getCountIterations());

        assertEquals(11, numberFinder.findIndex(-5));
        assertEquals(4, numberFinder.getCountIterations());

        assertEquals(0, numberFinder.findIndex(565));
        assertEquals(3, numberFinder.getCountIterations());

        //not found cases
        assertEquals(-1, numberFinder.findIndex(10));
        assertEquals(4, numberFinder.getCountIterations());

        final NumberFinder numberFinderNull = new NumberFinder(null);
        assertEquals(-1, numberFinderNull.findIndex(1));
        assertEquals(0, numberFinderNull.getCountIterations());

        final NumberFinder numberFinderEmpty = new NumberFinder(new int []{});
        assertEquals(-1, numberFinderEmpty.findIndex(1));
        assertEquals(0, numberFinderEmpty.getCountIterations());

        final NumberFinder numberFinderOne = new NumberFinder(new int []{0});
        assertEquals(-1, numberFinderOne.findIndex(1));
        assertEquals(0, numberFinderOne.findIndex(0));
    }
}
