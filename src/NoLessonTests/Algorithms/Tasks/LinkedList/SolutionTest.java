package NoLessonTests.Algorithms.Tasks.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void reverseList() {
        Node list0 = new Node(6);
        list0.next = new Node(1);
        list0.next.next = new Node(3);
        Node list1 = new Solution().reverseList(list0);
        assertEquals(3, list1.data);
        assertEquals(1, list1.next.data);
        assertEquals(6, list1.next.next.data);
    }
}