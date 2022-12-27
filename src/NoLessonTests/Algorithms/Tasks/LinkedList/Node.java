package NoLessonTests.Algorithms.Tasks.LinkedList;

public class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        node.next = next;
        next = node;
    }



    public void show(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
class Solution
{
    public Node reverseList(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
