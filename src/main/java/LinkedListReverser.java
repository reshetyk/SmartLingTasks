/**
 * @author Alexey
 *
 * Implement algorithm of reversing a singly linked list in Java.
 * Use your own implementation of singly linked list (do not use standard Java lists or arrays).
 * Tests are welcome.
 */

public class LinkedListReverser {

    public static SinglyLinkedList reverse(SinglyLinkedList list) {
        SinglyLinkedList prev = null;
        SinglyLinkedList next = null;
        while (true){
            next = list.next;
            list.next = prev;
            prev = list;
            if (next == null) return list;
            list = next;
        }
    }
}

class SinglyLinkedList<T> {
    T entry;
    SinglyLinkedList cur = this;
    SinglyLinkedList next;

    SinglyLinkedList(T entry) {
        this.entry = entry;
    }

    public void addNext(T entry) {
        if (entry == null) {
            throw new IllegalArgumentException("null is not allowed here");
        }
        cur.next = new SinglyLinkedList<T>(entry);
        cur = cur.next;
    }

    @Override
    public String toString() {
        return entry + (next != null ? "->" + next : "");
    }
}
