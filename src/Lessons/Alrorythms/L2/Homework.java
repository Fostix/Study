package Lessons.Alrorythms.L2;

public class Homework {
    public static void main(String[] args) {
        Try hereFillArrayFunctionHave = new Try();
        int lengthArray = 100000000;

        int[] arr = new int[lengthArray];
        hereFillArrayFunctionHave.fillArray(arr);


        long startTime = System.nanoTime();
        System.out.println(startTime);
        sort(arr);

        long endTime = System.nanoTime();
        long result = (endTime - startTime);

        //hereFillArrayFunctionHave.showArray(arr);
        System.out.println(hereFillArrayFunctionHave.checkArr(arr));
        System.out.println(result);
    }

    static void heapify(int[] arr, int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;
        if (r < N && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    static void sort(int[] arr) {

        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0 ; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
}
