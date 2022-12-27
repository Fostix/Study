package NoLessonTests.Algorithms.Tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findSecondMaxNumberInArrayTest {
    @Test
    public void secondLargestTest() {
        assertEquals(6, new findSecondMaxNumberInArray().secondLargest(new int[]{1, 2, 4, 8, 2, 3, 6}, 3));
    }
}