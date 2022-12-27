package Lessons.Alrorythms.L3;

public class DoubleList {
    private Node head, tail;

    private class Node {
        private int value;
        private Node next, prev;
    }

    public void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null)
            tail = node;
        else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public void popFront() {
        if (head != null){
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head.next.prev = null;
                head = head.next;
            }
        }
    }

    public void pushBack(int value) {
        Node node = new Node();
        node.value = value;
        if (tail == null)
            head = node;
        else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;
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

    public void sort() {
        boolean needSort = true;
        do {
            needSort = false;
            Node cur = head;
            while (cur != null) {
                if (cur.next != null) {
                    if (cur.value > cur.next.value) {
                        Node cnxt = cur.next;
                        Node L = cur.prev;
                        Node R = cnxt.next;

                        if (L != null) {
                            L.next = cnxt;
                            cnxt.prev = L.prev;
                        } else {
                           L.next = cur;
                           cnxt.prev = L.next;
                        }

                        if (R != null) {
                            R.prev = cur;
                            cur.next = R;
                        } else {
                            R.next = cnxt;
                            cnxt.prev = R.next;
                        }
                        cnxt.next = cur;
                        cur.prev = cnxt;

                        needSort = true;
                    }
                }
                cur = cur.next;
            }
        }while (needSort);
    }

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    private void revert(Node cur, Node prev) {
        if (cur.next == null)
            head = cur;
        else
            revert(cur.next, cur);
        cur.next = prev;
        prev.next = null;
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.pushBack(6);
        doubleList.pushBack(2);
        doubleList.pushFront(5);
        doubleList.pushFront(8);
        doubleList.pushFront(1);

        doubleList.print();
        doubleList.revert();
        System.out.println();
        doubleList.print();
//        Node x = onesList.find(5);
//        if (x != null)
//            System.out.println(onesList.find(6).value);
    }
}
