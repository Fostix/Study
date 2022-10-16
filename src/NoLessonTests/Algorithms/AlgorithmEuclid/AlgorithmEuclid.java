package NoLessonTests.Algorithms.AlgorithmEuclid;

public class AlgorithmEuclid {
    public static void main(String[] args) {
        AlgorithmEuclidClass euclid = new AlgorithmEuclidClass(119, 544);
        AlgorithmEuclidClass euclid2 = new AlgorithmEuclidClass(56, 9);
        AlgorithmEuclidClass euclid3 = new AlgorithmEuclidClass(2166, 6099);
//        System.out.println(euclid2.algorithmEuclid());
//        int count = 50;
//        for (int i = 1; i <= count; i++) {
//            for (int j = 1; j <= count; j++) {
//                System.out.printf("%d   ", euclid2.algorithmEuclid(i, j));
//                if (j % 10 == 0)
//                    System.out.println();
//            }
//        }
        System.out.println(euclid3.algorithmF());
///        System.out.println(euclid3.algorithmEuclidAddIf());
        // System.out.println(euclid.algorithmEuclidRecursive());
        // System.out.println(euclid.algorithmEuclid());
    }
}

class AlgorithmEuclidClass {
    private int m,
    n,
    r;

    public AlgorithmEuclidClass(int m, int n) {
        this.m = m;
        this.n = n;
        r = this.m;
    }

    public int algorithmEuclid() {
        while(r != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public int algorithmEuclid(int m, int n) {
        this.m = m;
        this.n = n;
        while(r != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public int algorithmEuclidAddIf() {
        int temp;
        while(r != 0) {
           if (m < n) {
                temp = n;
                n = m;
                m = temp;
            }
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public int algorithmEuclidRecursive() {
        if (r != 0) {
            r = m % n;
            m = n;
            n = r;
            algorithmEuclidRecursive();
        }
        return m;
    }

    public int algorithmF() {
        while(m != 0 || n != 0) {
            m = m % n;
            if (m == 0)
                return n;
            n = n % m;
            if (n == 0)
                return m;
        }
        return m;
    }
}
