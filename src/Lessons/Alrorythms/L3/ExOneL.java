package Lessons.Alrorythms.L3;

public class ExOneL { // LIFO
    Node head;

    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
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
    }
}
