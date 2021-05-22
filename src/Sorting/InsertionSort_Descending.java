package Sorting;// Introduction to Algorithms 3rd edition, chapter 2.1
// Insertion sort in descending order for problem 2.1-2

public class InsertionSort_Descending extends SortingAlgorithm {
  protected void sort(int[] arr) {
    // An array of length 0 or 1 is already sorted
    if (arr.length <= 1) return;

    // starting at the second element,
    for (int index=1; index<arr.length; index++) {
      // shift the element left until the first index or it is less than the element to the left
      int value = arr[index];
      int j = index;
      while (j > 0 && arr[j - 1] < value) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = value;
    }
  }
}
