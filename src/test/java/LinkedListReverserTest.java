import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Alexey
 */
public class LinkedListReverserTest {
    @Test
    public void testReverse() throws Exception {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("a","b","c","d","e");

        assertEquals("a->b->c->d->e", list.toString());

        System.out.println(list);

        list.reverse();

        assertEquals("e->d->c->b->a", list.toString());

        System.out.println(list);

        list.reverse();

        assertEquals("a->b->c->d->e", list.toString());

        System.out.println(list);

        SinglyLinkedList<String> list2 = new SinglyLinkedList<String>("a","b");

        list2.reverse();

        assertEquals("b->a", list2.toString());

        System.out.println(list2);

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testReverseFail() throws Exception {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add(null);
    }
}
