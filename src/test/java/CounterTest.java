import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Pad
 * @since 2017-09-13.
 */
public class CounterTest {

  Counter myCounter;

  @BeforeEach
  void setUp() {
    this.myCounter = new Counter();
  }

  @Test
  void testIncrement() {
    myCounter.increment();
    assertEquals(1, myCounter.getCount());
  }

  @Test
  void testDecrement() {
    myCounter.decrement();
    myCounter.decrement();
    assertEquals(-2, myCounter.getCount(), "Result should be -2");
  }

  @Test
  public void testGetNullList() {
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      new ArrayList<Object>().get(0);
    });
  }
}
