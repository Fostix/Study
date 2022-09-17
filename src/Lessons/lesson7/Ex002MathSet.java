package Lessons.lesson7;

import java.util.Arrays;
import java.util.HashSet;

public class Ex002MathSet {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a);
        System.out.println(u + " u - noting operation");
        u.addAll(b);
        var r = new HashSet<Integer>(a);
        System.out.println(r + " r - noting operation");
        r.retainAll(b);
        var s = new HashSet<Integer>(a);
        s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u + " u - addAll"); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r + " r - retainAll"); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
        System.out.println(a);
        System.out.println(res);
    }
}
