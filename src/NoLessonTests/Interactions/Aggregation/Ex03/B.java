package NoLessonTests.Interactions.Aggregation.Ex03;

import java.util.ArrayList;
import java.util.List;

public class B {
    private List<A> listA;

    public B() {
        this.listA = new ArrayList<>();
    }

    public void append(A a) {
        listA.add(a);
    }
}
