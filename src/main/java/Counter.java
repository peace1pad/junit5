/**
 * @author Pad
 * @since 2017-09-13.
 */
public class Counter {

  int count = 0;

  public int increment() {
    return count += 1;
  }

  public int decrement() {
    return count -= 1;
  }

  public int getCount() {
    return count;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }
}
