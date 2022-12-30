package Lessons.Alrorythms.L4;

public class HashTable {
    int size;
    int initBucketCount = 16;
    Basket[] baskets;
    public HashTable() {
        //this(initBusketCount);
    }

    public HashTable(int initSize) {
        //baskets = (Bucket[])new Object[initSize];
    }
    public class Entity {
        int key, value;
    }
    public class Basket {
        Node head;
        public class Node{
            Entity value;
            Node next;
        }
        public int get(int key) {
            Node cur = head;
            while (cur != null) {
                if (cur.value.key == key) {
                    return cur.value.value;
                }
                cur = cur.next;
            }
            return -1;
        }

        public boolean push(Entity value) {
            Node node = new Node();
            node.value = value;

            Node cur = head;
            if (head != null) {
                while (cur != null) {
                    if (cur.value == value) {
                        return false;
                    }
                    if (cur.next == null) {
                        cur.next = node;
                    }
                    cur = cur.next;
                }
            }else {
                head = node;
            }
            return true;
        }

        public boolean pop(int key) {
            Node cur = head;
            if (head != null) {
                while (cur.next != null) {
                    if (cur.next.value.key == key) {
                        cur.next = cur.next.next;
                        return true;
                    }
                    cur = cur.next;
                }
            }
            return false;
        }
    }

    public int getIndex(int key) {
        //return key.hashCode() % size;
        return key % size;
    }

    public int get(int key) {
        int indes = getIndex(key);
        Basket basket = baskets[indes];
        if (basket != null) {
            return basket.get(key);
        }
        return -1;
    }

    public void add(int key, int value) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket == null) {
            basket = new Basket();
            baskets[index] = basket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;
        basket.push(entity);
    }

    public void pop(int key) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        basket.pop(key);
    }
}
