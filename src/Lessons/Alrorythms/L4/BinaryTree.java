package Lessons.Alrorythms.L4;

public class BinaryTree {
    Node root;
    public class Node {
        int value;
        Node left, right;
    }

    public Node find(int value) {
        Node cur = root;
        while (cur != null) {
            if (cur.value == value)
                return cur;
            if (cur.value < value) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return null;
    }

    public Node recFind(Node node, int value) {
        if (node == null)
            return null;
        if (node.value == value)
            return node;
        if (node.value < value) {
            return recFind(node.right, value);
        } else {
            return recFind(node.left, value);
        }
    }
}
