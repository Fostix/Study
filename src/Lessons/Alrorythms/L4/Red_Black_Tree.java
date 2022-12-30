package Lessons.Alrorythms.L4;

enum Color {
    Red,
    Black
}
public class Red_Black_Tree {
    public static void main(String[] args) {
        Red_Black_Tree tree = new Red_Black_Tree();
        for (int i = 0; i < 100; i++) {
             tree.add(i);
        }
    }
    Node root;

    class Node {
        int value;
        Node left, right;
        Color color;
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.Black;
            return result;
        } else {
            root = new Node();
            root.color = Color.Black;
            root.value = value;
            return true;
        }
    }
    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > 0) {
                if (node.left != null) {
                    boolean result = addNode(node.left, value);
                    node.left = rebalance(node.left);
                    return result;
                } else {
                    node.left = new Node();
                    node.left.color = Color.Red;
                    node.left.value = value;
                    return true;
                }
            } else {
                if (node.right != null) {
                    boolean result = addNode(node.right, value);
                    node.right = rebalance(node.right);
                    return result;
                } else {
                    node.right = new Node();
                    node.right.color = Color.Red;
                    node.right.value = value;
                    return true;
                }
            }
        }
    }

    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.right != null && result.right.color == Color.Red && (result.left  == null || result.left.color == Color.Black)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.left != null && result.left.color == Color.Red && result.left.left != null && result.left.left.color == Color.Red) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.left != null && result.left.color == Color.Red && result.right != null && result.right.color == Color.Red) {
                needRebalance =true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    private Node rightSwap(Node node) {
        Node rightChild = node.right;
        Node betweenChild = rightChild.left;
        rightChild.left = node;
        node.right = betweenChild;
        rightChild.color = node.color;
        node.color = Color.Red;
        return rightChild;
    }

    private Node leftSwap(Node node) {
        Node leftChild = node.left;
        Node betweenChild = leftChild.right;
        leftChild.right = node;
        node.left = betweenChild;
        leftChild.color = node.color;
        node.color = Color.Red;
        return leftChild;
    }

    private void colorSwap(Node node) {
        node.right.color = Color.Black;
        node.left.color = Color.Black;
        node.color = Color.Red;
    }

    public Node find(int value) {
        Node cur = root;
        while (cur != null) {
            if (cur.value == value)
                return cur;
            if (cur.value < value) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Red_Black_Tree{" +
                "root=" + root.value +
                '}';
    }
}

