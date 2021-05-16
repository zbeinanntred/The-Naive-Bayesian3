// Introduction to Algorithms 3rd edition, chapter 2.1
// Initial attempt at the insertion sort algorithm before reading pseudocode
class InsertionSort_Initial {
  static void run() {
    // a simple example run for the algorithm
    int[] array = {-1, 3, 1, 10, 5, 4, 2, 6};

    sort(array);

    for (int i : array) {
      System.out.println(i);
    }
  }

  static void sort(int[] arr) {
    // An array of length 0 or 1 is already sorted
    if (arr.length <= 1) return;

    // starting at the first element,
    for (int i=1; i<arr.length; i++) {
      // iterate through previous elements until a greater one is found
      for (int j=0; j<i; j++) {
        // if a greater one *is* found,
        if (arr[j] > arr[i]) {
          // insert the item in index i into index j
          InsertionSort_Initial.insert(i, j, arr);
        }
      }
    }
  }

  private static void insert(int itemIndex, int insertionIndex, int[] arr) {
    if (insertionIndex > arr.length) {
      throw new ArrayIndexOutOfBoundsException("insertion index larger than array length");
    }
    if (itemIndex > arr.length) {
      throw new ArrayIndexOutOfBoundsException("item index larger than array length");
    }

    int value = arr[itemIndex];
    int nextValue;
    for (int index=insertionIndex; index<=itemIndex; index++) {
      nextValue = arr[index];
      arr[index] = value;
      value = nextValue;
    }
  }
}
