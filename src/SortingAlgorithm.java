public abstract class SortingAlgorithm implements Algorithm {
  public void run() {
    // a simple example run for the algorithm
    int[] array = {-1, 3, 1, 10, 5, 4, 2, 6};

    sort(array);

    for (int i : array) {
      System.out.println(i);
    }
  }

  protected void sort(int[] arr) { }
}
