package NoLessonTests.Algorithms.Tasks;

public class findSecondMaxNumberInArray {
    public int secondLargest(int[] arr, int n) {
        if(arr.length > 1) {
            int max = Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    secMax = max;
                    max = arr[i];
                }
                else if (arr[i] > secMax && arr[i] != max)
                    secMax = arr[i];
            }
            return secMax;
        } else
            return -1;
    }
}
