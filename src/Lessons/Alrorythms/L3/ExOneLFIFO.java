package Lessons.Alrorythms.L3;

public class ExOneLFIFO {
    Node head;
    Node tail;

    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public Integer peek() {
        Integer result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head; // for last node became null!
            revert(head.next, head);
            temp.next = null; // for last node became null!
        }
    }

    private void revert(Node currenctNode, Node previousNode) {
        if (currenctNode.next == null)
            head = currenctNode;
        else
            revert(currenctNode.next, currenctNode);
        currenctNode.next = previousNode;
        //previousNode.next = null; // for last node became null!
    }

    public class Node {
        int value;
        Node next;

        Node previous;
    }
}
