import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author Pad
 * @since 2017-09-13.
 */
class MathTest {

  static Math math;

  @BeforeAll
  static void setup(){
    math = new Math();
  }

  static Stream<String> stringProvider(){
    return Stream.of("foo", "bar");
  }

  @ParameterizedTest
  @ValueSource(strings = {"Hello", "World"})
  void testWithStringParameter(String argument) {
    assertNotNull(argument);
  }

  @ParameterizedTest
  @MethodSource("stringProvider")
  void testWithSimpleMethodSource(String argument) {
    assertNotNull(argument);
  }

  @ParameterizedTest
  @CsvSource({"0, 5, 5", "3, 5, 5", "3, -5, 3"})
  public void testMax(int input1, int input2, int expectOutput) {
    assertEquals(expectOutput, math.max(input1, input2));
  }
}
