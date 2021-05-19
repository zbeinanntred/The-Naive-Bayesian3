package Sorting;

import RunnerUtilities.Algorithm;

public abstract class SortingAlgorithm implements Algorithm {
  public final void run() {
    // a simple example run for the algorithm
    int[] array = {-1, 3, 1, 10, 5, 4, 2, 6};

    sort(array);

    System.out.print("\n{ ");
    for (int i : array) {
      System.out.printf("%d, ", i);
    }
    System.out.println("}");
  }

  protected void sort(int[] arr) { }
}
