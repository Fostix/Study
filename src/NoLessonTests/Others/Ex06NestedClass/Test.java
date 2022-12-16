package NoLessonTests.Others.Ex06NestedClass;

public class Test {
    private int variable;
    private static int variableStatic;
    private static final int variableStaticFinal = 1;

    {
        variableStatic = 0;
    }

    private void method() {
        System.out.println("method");
    }

    private final void secondMethod() {
        System.out.println("secondMethod");
    }

    private static void thirdMethod() {
        System.out.println("thirdMethod");
    }

    private static void fourthMethod() {
        System.out.println("fourthMethod");
    }

    public class InnerClass {
        private int innerVariable;
        private static int innerVariableStatic;
        private static final int innerVariableStaticFinal = 1;

        {
            innerVariableStatic = 0;
        }

        private void innerMethod() {
            System.out.println("innerMethod");
        }

        private final void innerSecondMethod() {
            System.out.println("innerSecondMethod");
        }

        private static void innerThirdMethod() {
            System.out.println("innerThirdMethod");
        }

        private static void innerFourthMethod() {
            System.out.println("innerFourthMethod");
        }

        private void test() {
            secondMethod();
            thirdMethod();
            fourthMethod();

            innerMethod();
            innerFourthMethod();
            innerSecondMethod();
            innerThirdMethod();

            System.out.println(variable);
            System.out.println(variableStatic);
            System.out.println(variableStaticFinal);
            System.out.println(innerVariable);
            System.out.println(innerVariableStatic);
            System.out.println(innerVariableStaticFinal);
        }

        public static class InnerInnerClass {

        }
    }
}
