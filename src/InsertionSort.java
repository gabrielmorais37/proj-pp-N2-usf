public class InsertionSort {
    public static SortingResult insertionSort(int[] arr) {
        int n = arr.length;
        long swaps = 0;
        long comparisons = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            comparisons++;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                swaps++;
                comparisons++;
            }
            arr[j + 1] = key;
        }

        return new SortingResult(swaps, comparisons);
    }
}