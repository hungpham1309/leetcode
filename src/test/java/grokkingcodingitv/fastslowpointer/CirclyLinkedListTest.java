package grokkingcodingitv.fastslowpointer;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CirclyLinkedListTest {

  @Test
  public void testIsCirclyLinkedList() {
    LinkedList linkedList = new LinkedList();

    linkedList.insert(1);
    linkedList.insert(3);
    linkedList.insert(0);
    linkedList.insert(9);
    linkedList.insert(9);
    linkedList.insert(6);

    linkedList.tail.next = linkedList.head.next.next;

    CirclyLinkedList circlyLinkedList = new CirclyLinkedList();
    assertThat(circlyLinkedList.isCirclyLinkedList(linkedList)).isTrue();
  }

  @Test
  public void testIsNotCirclyLinkedList() {
    LinkedList linkedList = new LinkedList();

    linkedList.insert(1);
    linkedList.insert(3);
    linkedList.insert(0);
    linkedList.insert(9);
    linkedList.insert(9);
    linkedList.insert(6);

    CirclyLinkedList circlyLinkedList = new CirclyLinkedList();
    assertThat(circlyLinkedList.isCirclyLinkedList(linkedList)).isFalse();
  }
}