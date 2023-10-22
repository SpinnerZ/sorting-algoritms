import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.example.NumberGeneration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGenerationTest {

  @Test
  @DisplayName("getOrderedNumbers Happy Path")
  void getOrderedNumbersShouldReturnASequenceFrom1To10() {

    assertArrayEquals(
        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, NumberGeneration.getOrderedNumbers(10));
  }

  @Test
  @DisplayName("getInvertedNumber Happy Path")
  void getInvertedNumbersShouldReturnASequenceFrom10To1() {

    assertArrayEquals(
        new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, NumberGeneration.getInvertedNumbers(10));
  }

  @Test
  @DisplayName("getRandomNumbers Happy Path")
  void getRandomNumberShouldReturnARandomArray() {

    int[] result = NumberGeneration.getRandomNumbers(10);

    System.out.println(Arrays.toString(result));
    assertEquals(10, result.length);
  }
}
