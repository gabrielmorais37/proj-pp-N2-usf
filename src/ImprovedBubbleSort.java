import java.util.Arrays;

public class ImprovedBubbleSort {
    public static SortingResult improvedBubbleSort(int[] arr) {
        int n = arr.length;
        long swaps = 0;
        long comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swaps++;
                }
            }
            if (!swapped) {
                // Se nenhum elemento foi trocado nesta passagem, o array já está ordenado.
                return new SortingResult(swaps, comparisons);
            }
        }
        return new SortingResult(swaps, comparisons);
    }
}
