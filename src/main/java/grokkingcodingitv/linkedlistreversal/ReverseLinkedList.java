package grokkingcodingitv.linkedlistreversal;

import grokkingcodingitv.LinkedList;
import grokkingcodingitv.Node;

public class ReverseLinkedList {

    public Node reverseLinkedList(LinkedList linkedList) {
        Node previous = null;

        Node temp;

        Node current = linkedList.getHead();

        while (current != null) {
            temp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = temp;
        }

        return previous;
    }

    /**
     * reverse a linkedlist from p to q
     */
    public Node reversePartLinkedList(LinkedList linkedList, int p, int q) {
        Node current = linkedList.getHead();
        Node previous = null;
        Node temp = null;

        //skip p nodes and remember the p-1;
        for (int i = 0; i < p -1; ++i) {
            temp = current;
            current = current.getNext();
        }

        //reverse from p to q
        Node lastOfBefore = temp;
        Node lastOfSublist = current;
        for (int i = p; i <= q; i++) {
            temp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = temp;
        }

        lastOfBefore.setNext(previous);
        lastOfSublist.setNext(current);
        return linkedList.getHead();
    }
}
