import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};
        String[] scenarios = {"Melhor Caso", "Caso Médio", "Pior Caso"};

        System.out.println("trocas,comparacao,size,cenario,tempo,algoritmo");

        for (int size : sizes) {
            for (String scenario : scenarios) {
                int[] arr = generateArray(size, scenario);

//                long startTime = System.currentTimeMillis();
//                SortingResult results = BubbleSort.bubbleSort(arr);
//                long endTime = System.currentTimeMillis();
//                long executionTime = endTime - startTime;
//
//                System.out.println(results.swaps + "," + results.comparisons + "," + size + "," + scenario + "," + executionTime + "," + "BubbleSort");

//                long startTime2 = System.currentTimeMillis();
//                SortingResult results2 = ImprovedBubbleSort.improvedBubbleSort(arr);
//                long endTime2 = System.currentTimeMillis();
//                long executionTime2 = endTime2 - startTime2;
//
//                System.out.println(results2.swaps + "," + results2.comparisons + "," + size + "," + scenario + "," + executionTime2 + "," + "ImprovedBubbleSort");

//                long startTime3 = System.currentTimeMillis();
//                SortingResult results3 = InsertionSort.insertionSort(arr);
//                long endTime3 = System.currentTimeMillis();
//                long executionTime3 = endTime3 - startTime3;
//
//                System.out.println(results3.swaps + "," + results3.comparisons + "," + size + "," + scenario + "," + executionTime3 + "," + "InsertionSort");

//                long startTime4 = System.currentTimeMillis();
//                SortingResult results4 = MergeSort.mergeSort(arr);
//                long endTime4 = System.currentTimeMillis();
//                long executionTime4 = endTime4 - startTime4;
//
//                System.out.println(results4.swaps + "," + results4.comparisons + "," + size + "," + scenario + "," + executionTime4 + "," + "MergeSort");

                long startTime5 = System.currentTimeMillis();
                SortingResult results5 = QuickSort.quickSort(arr);
                long endTime5 = System.currentTimeMillis();
                long executionTime5 = endTime5 - startTime5;

                System.out.println(results5.swaps + "," + results5.comparisons + "," + size + "," + scenario + "," + executionTime5 + "," + "QuickSort");
            }
        }
    }

    private static int[] generateArray(int size, String scenario) {
        int[] arr = new int[size];
        Random random = new Random();

        switch (scenario) {
            case "Melhor Caso":
                for (int i = 0; i < size; i++) {
                    arr[i] = i;
                }
                break;
            case "Caso Médio":
                for (int i = 0; i < size; i++) {
                    arr[i] = random.nextInt(size * 10);
                }
                break;
            case "Pior Caso":
                for (int i = 0; i < size; i++) {
                    arr[i] = size - i;
                }
                break;
        }

        return arr;
    }
}