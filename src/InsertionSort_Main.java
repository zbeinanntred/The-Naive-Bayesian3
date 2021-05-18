// Introduction to Algorithms 3rd edition, chapter 2.1
// Second attempt at the insertion sort algorithm (after reading pseudocode)
class InsertionSort_Main extends SortingAlgorithm {
  protected void sort(int[] arr) {
    // An array of length 0 or 1 is already sorted
    if (arr.length <= 1) return;

    // starting at the second element,
    for (int i=1; i<arr.length; i++) {
      // shift the element left until the first index or it is greater than the element to the left
      int j = i-1;
      int value = arr[i];
      while (j>=0 && arr[j] < arr[j-1]) {
        arr[j] = arr[j-1];
        j--;
        value = arr[j];
      }
      arr[j] = value;
    }
  }
}
