public class SortingResult {
    long swaps;
    long comparisons;
    int partition;

    SortingResult(long swaps, long comparisons) {
        this.swaps = swaps;
        this.comparisons = comparisons;
    }

    SortingResult(long swaps, long comparisons, int partition) {
        this.swaps = swaps;
        this.comparisons = comparisons;
        this.partition = partition;
    }
}