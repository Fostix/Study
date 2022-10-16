package NoLessonTests.Algorithms.Sorts;

public class Main {
    public static void main(String[] args) {
        PrintArray print = new PrintArray();
        FillArray fill = new FillArray();

        //region selectionSort
        SelectionSort selection = new SelectionSort();
        int array[] = new int[100];
        fill.fillArray(array);
        selection.sort(array);
        print.printArray(array);
        //endregion
    }
}
