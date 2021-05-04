import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
  public void add(Item item) {

  }

  public boolean isEmpty() {
    return true;
  }

  public int size() {
    return 0;
  }

  @Override
  public Iterator<Item> iterator() {
    return null;
  }
}
