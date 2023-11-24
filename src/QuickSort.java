public class QuickSort {
    public static SortingResult quickSort(int[] arr) {
        long swaps = 0;
        long comparisons = 0;
        return quickSortHelper(arr, 0, arr.length - 1, swaps, comparisons);
    }

    private static SortingResult quickSortHelper(int[] arr, int low, int high, long swaps, long comparisons) {
        SortingResult sortingResult1 = new SortingResult(0, 0), sortingResult2 = new SortingResult(0, 0), sortingResult;

        if (low < high) {
            sortingResult = partition(arr, low, high, swaps, comparisons);
            sortingResult1 = quickSortHelper(arr, low, sortingResult.partition - 1, swaps, comparisons);
            sortingResult2 = quickSortHelper(arr, sortingResult.partition + 1, high, swaps, comparisons);
        }

        return new SortingResult(sortingResult1.swaps + sortingResult2.swaps, sortingResult1.comparisons + sortingResult2.comparisons);
    }

    private static SortingResult partition(int[] arr, int low, int high, long swaps, long comparisons) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparisons++;
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        swaps++;

        return new SortingResult(swaps, comparisons, i + 1);
    }
}
