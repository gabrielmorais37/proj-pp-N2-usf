public class MergeSort {
    public static SortingResult mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        long swaps = 0;
        long comparisons = 0;
        return mergeSortHelper(arr, temp, 0, arr.length - 1, swaps, comparisons);
    }

    private static SortingResult mergeSortHelper(int[] arr, int[] temp, int left, int right, long swaps, long comparisons) {
        SortingResult sortingResult1 = new SortingResult(0, 0), sortingResult2 = new SortingResult(0, 0), sortingResult = new SortingResult(0, 0);
        if (left < right) {
            int mid = (left + right) / 2;
            sortingResult1 = mergeSortHelper(arr, temp, left, mid, swaps, comparisons);
            sortingResult2 = mergeSortHelper(arr, temp, mid + 1, right, swaps, comparisons);
            sortingResult = merge(arr, temp, left, mid, right, swaps, comparisons);
        }
        return new SortingResult(sortingResult1.swaps + sortingResult2.swaps + sortingResult.swaps, sortingResult1.comparisons + sortingResult2.comparisons + sortingResult.comparisons);
    }

    private static SortingResult merge(int[] arr, int[] temp, int left, int mid, int right, long swaps, long comparisons) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            comparisons++;
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
                swaps++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        return new SortingResult(swaps, comparisons);
    }
}
