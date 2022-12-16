package NoLessonTests.Interactions.Aggregation.Ex04;

import java.util.ArrayList;
import java.util.List;

public class B {
    private final List<A> listA;

    public B() {
        this.listA = new ArrayList<>();
    }

    public void append(A a) {
        listA.add(a);
    }
}
