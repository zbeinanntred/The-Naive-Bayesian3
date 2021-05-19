package Sorting;// Introduction to Algorithms 3rd edition, chapter 2.1
// Second attempt at the insertion sort algorithm (from memory after reading pseudocode)

// NOTE: the main thing we gain over the initial approach is a better insert loop
// originally we came from the left (0-index) and had to track several variables
// the new loop shifts values to the right much more cleanly

// HEADS-UP: it is easy to mess up the 0-index case (smallest number) for the inner loop
// I did this an embarrassing number of times when writing this from memory of the book

public class InsertionSort_Main extends SortingAlgorithm {
  protected void sort(int[] arr) {
    // An array of length 0 or 1 is already sorted
    if (arr.length <= 1) return;

    // starting at the second element,
    for (int index=1; index<arr.length; index++) {
      // shift the element left until the first index or it is greater than the element to the left
      int value = arr[index];
      int j = index;
      while (j > 0 && arr[j - 1] > value) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = value;
    }
  }
}
