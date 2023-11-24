public class BubbleSort {
    public static SortingResult bubbleSort(int[] arr) {
        int n = arr.length;
        long swaps = 0;
        long comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return new SortingResult(swaps, comparisons);
    }
}