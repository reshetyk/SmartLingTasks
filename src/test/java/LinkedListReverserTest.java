import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Alexey
 */
public class LinkedListReverserTest {
    @Test
    public void testReverse() throws Exception {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("a");
        list.addNext("b");
        list.addNext("c");
        list.addNext("d");

        assertEquals("a->b->c->d", list.toString());

        System.out.println(list);

        final SinglyLinkedList reverse = LinkedListReverser.reverse(list);

        assertEquals("d->c->b->a", reverse.toString());

        System.out.println(reverse);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testReverseFail() throws Exception {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("a");
        list.addNext(null);
    }
}
