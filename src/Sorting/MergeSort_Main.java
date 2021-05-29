package Sorting;

// Introduction to Algorithms 3rd edition, chapter 2.3.1
// Attempt at the merge sort algorithm after reading pseudocode
// main improvement is to memory usage:
// by only creating copies of the array in the merge step we use at most space for 2n integers
// also moving the sentinel value logic out cleans up the code significantly
public class MergeSort_Main extends SortingAlgorithm {
    protected void sort(int[] arr) {
        this.mergeSort(arr, 0, arr.length);
    }

    private void mergeSort(int[] arr, int start, int end) {
        // Arrays of length <=1 are already sorted
        if (end - start <= 1) return;

        // split the array in two and recursively merge sort each half
        int mid = (end - start) / 2 + start;
        mergeSort(arr, 0, mid);
        mergeSort(arr, mid, end);

        // merge the two sorted halves
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] copy1 = copyWithSentinel(arr, start, mid);
        int[] copy2 = copyWithSentinel(arr, mid, end);

        int index1 = 0;
        int index2 = 0;

        for (int i = start; i < end; i++) {
            if (copy1[index1] < copy2[index2]) {
                arr[i] = copy1[index1];
                index1++;
            } else {
                arr[i] = copy2[index2];
                index2++;
            }
        }
    }

    private int[] copyWithSentinel(int[] arr, int start, int end) {
        int size = end-start + 1;
        int[] copy = new int[size];
        System.arraycopy(arr, start, copy, 0, size - 1);
        copy[size - 1] = Integer.MAX_VALUE;

        return copy;
    }
}
