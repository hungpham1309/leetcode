package grokkingcodingitv.fastslowpointer;

public class CirclyLinkedList {

  public boolean isCirclyLinkedList(LinkedList linkedList) {
    Node slowPointer = linkedList.head;
    Node fastPointer = linkedList.head;

    while (fastPointer != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;

      if (slowPointer == fastPointer) {
        return true;
      }
    }
    return false;

  }

  public int lengthOfCirclyLinkedList(LinkedList linkedList) {
    Node slowPointer = linkedList.head;
    Node fastPointer = linkedList.head;
    int count = 0;

    while (fastPointer != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
      if (slowPointer == fastPointer) {
        Node current = slowPointer;
        do {
          current = current.next;
          count++;
        }
        while (current != slowPointer);
        return count;
      }
    }
    return count;
  }

  public int findStartOfCircleLinkedList(LinkedList linkedList) {

    Node slowPointer = linkedList.head;
    Node fastPointer = linkedList.head;
    int count = 0;

    while (fastPointer != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;

      if (slowPointer == fastPointer) {
        Node current = slowPointer;
        do {
          current = current.next;
          count++;
        } while (current != slowPointer);
        break;
      }
    }

    slowPointer = linkedList.head;
    fastPointer = linkedList.head;

    for (int i = 0 ; i < count ; i++) {
      fastPointer = fastPointer.next;
    }

    while (slowPointer != fastPointer) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next;
    }
    return slowPointer.value;
  }
}

class LinkedList {

  Node head;
  Node tail;

  public LinkedList() {
  }

  public void insert(int value) {
    if (head == null) {
      head = tail = new Node(value, null);
    } else {
      tail.next = new Node(value, null);
      tail = tail.next;
    }
  }
}

class Node {

  int value;
  Node next;

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public Node() {
  }
}
