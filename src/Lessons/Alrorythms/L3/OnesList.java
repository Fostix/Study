package Lessons.Alrorythms.L3;

public class OnesList {
    private Node head;

    private class Node {
        private int value;
        private Node next;
    }

    public void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void pushBack(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null)
            head = node;
        else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
        }
    }

    public boolean consist(int value) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == value)
                return true;
            cur = cur.next;
        }
        return false;
    }

    public Node find(int value) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == value)
                return cur;
            cur = cur.next;
        }
        return null;
    }

    public void pring() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        OnesList onesList = new OnesList();
        onesList.pushBack(2);
        onesList.pushBack(6);
        onesList.pushBack(5);
        onesList.pushBack(8);
        onesList.pushBack(1);

        onesList.pring();

        Node x = onesList.find(5);
        if (x != null)
            System.out.println(onesList.find(6).value);
    }
}
