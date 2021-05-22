import Sorting.InsertionSort_Descending;
import Sorting.InsertionSort_Initial;
import Sorting.InsertionSort_Main;

public class Runner {
  public static void main(String[] args) {
    (new InsertionSort_Initial()).run();
    (new InsertionSort_Main()).run();
    (new InsertionSort_Descending()).run();
  }
}
