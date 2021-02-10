package grokkingcodingitv.linkedlistreversal;

import grokkingcodingitv.LinkedList;
import grokkingcodingitv.Node;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    public void shouldReverseLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        Node nodeAfterReverse = reverseLinkedList.reverseLinkedList(linkedList);

        assertThat(nodeAfterReverse.getValue()).isEqualTo(5);

    }

    @Test
    public void shouldReversePartLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        Node llAfterReverse = reverseLinkedList.reversePartLinkedList(linkedList, 2, 4);

        assertThat(llAfterReverse.getValue()).isEqualTo(1);
        assertThat(llAfterReverse.getNext().getValue()).isEqualTo(4);
        assertThat(llAfterReverse.getNext().getNext().getValue()).isEqualTo(3);
        assertThat(llAfterReverse.getNext().getNext().getNext().getValue()).isEqualTo(2);
        assertThat(llAfterReverse.getNext().getNext().getNext().getNext().getValue()).isEqualTo(5);

    }
}