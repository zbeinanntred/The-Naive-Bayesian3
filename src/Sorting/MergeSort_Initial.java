package Sorting;

import java.util.Arrays;

// Introduction to Algorithms 3rd edition, chapter 2.3.1
// Initial attempt at the merge sort algorithm before reading pseudocode
public class MergeSort_Initial extends SortingAlgorithm {
    protected void sort(int[] arr) {
        // we want to mutate the input but it's easier to return arrays in recursive sort
        // so we'll just get an arr from mergeSort and then copy it over
        int[] sortedArr = this.mergeSort(arr);

        System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    }

    private int[] mergeSort(int[] arr) {
        // Arrays of length <=1 are already sorted
        if (arr.length <= 1) return arr;

        // split the array in two and recursively merge sort each half
        int mid = arr.length / 2;
        int[] sorted1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] sorted2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // merge the two sorted halves
        return merge(sorted1, sorted2);
    }

    private int[] merge(int[] sorted1, int[] sorted2) {
        // if either array is empty, return the other, presumably nonempty one
        if (sorted1.length == 0) {
            return sorted2;
        } else if (sorted2.length == 0) {
            return sorted1;
        }

        int index1 = 0;
        int index2 = 0;
        int value1 = sorted1[0];
        int value2 = sorted2[0];
        int[] mergedArr = new int[sorted1.length + sorted2.length];

        for (int i=0; i<mergedArr.length; i++) {
            if (value1 < value2) {
                mergedArr[i] = value1;
                index1++;
                // if we hit the end, set value to a number that will always be bigger
                if (index1 == sorted1.length) {
                    value1 = Integer.MAX_VALUE;
                } else {
                    value1 = sorted1[index1];
                }
            } else {
                mergedArr[i] = value2;
                index2++;
                // if we hit the end, set value to a number that will always be bigger
                if (index2 == sorted2.length) {
                    value2 = Integer.MAX_VALUE;
                } else {
                    value2 = sorted2[index2];
                }
            }
        }

        return mergedArr;
    }
}
