package grokkingcodingitv;

public class LinkedList {

    private Node head;
    private Node tail;

    public void insert(int value) {
        if (head == null) {
            head = tail = new Node(value, null);
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
    }

    public Node getHead() {
        return head;
    }
}
