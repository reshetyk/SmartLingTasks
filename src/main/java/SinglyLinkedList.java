/**
 * @author Alexey
 *
 * Implement algorithm of reversing a singly linked list in Java.
 * Use your own implementation of singly linked list (do not use standard Java lists or arrays).
 * Tests are welcome.
 */

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(T... elements) {
        addAll(elements);
    }

    public void addAll(T... elements) {
        for(T element : elements) {
            add(element);
        }
    }

    public void add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("null is not allowed here");
        }
        final Node penultimate = tail;
        final Node node = new Node(element, null);
        tail = node;
        if (penultimate == null) {
            head = node;
        } else {
            penultimate.next = node;
        }
    }

    public void reverse() {
        if (head == null || head.next == null)
            return;

        final Node second = head.next;
        final Node third = second.next;

        second.next = head;
        head.next = null;

        Node cur = third;
        Node prev = second;

        while (cur != null) {
            Node nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }

        head = prev;
    }

    @Override
    public String toString() {
        return head.toString();
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        private Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            return element + (next != null ? "->" + next : "");
        }
    }

}
