import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.example.BubbleSort;
import org.example.PerformanceData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  private static final int[] inputArray = {
    41425, 36522, 2350, 82897, 62897, 41005, 47332, 42697, 33766, 2527
  };

  private static final int[] expectedArray = {
    2350, 2527, 33766, 36522, 41005, 41425, 42697, 47332, 62897, 82897
  };

  @Test
  @DisplayName("1st Version Bubble Sort")
  void ascendingBubbleSort1stVersionShouldPutArrayInOrderAndFillMeasurements() {

    final PerformanceData performanceData = BubbleSort.ascendingBubbleSort1stVersion(inputArray);

    assertArrayEquals(expectedArray, Objects.requireNonNull(performanceData).result());
    assertTrue(performanceData.comparations() > 10);
    assertTrue(performanceData.switches() > 1);
  }

  @Test
  @DisplayName("2nd Version Bubble Sort")
  void ascendingBubbleSort2ndVersionShouldPutArrayInOrderAndFillMeasurements() {

    final PerformanceData performanceData = BubbleSort.ascendingBubbleSort2ndVersion(inputArray);

    assertArrayEquals(expectedArray, Objects.requireNonNull(performanceData).result());
    assertTrue(performanceData.comparations() > 10);
    assertTrue(performanceData.switches() > 1);
  }

  @Test
  @DisplayName("3rd Version Bubble Sort")
  void ascendingBubbleSort3rdVersionShouldPutArrayInOrderAndFillMeasurements() {

    final PerformanceData performanceData = BubbleSort.ascendingBubbleSort3rdVersion(inputArray);

    assertArrayEquals(expectedArray, Objects.requireNonNull(performanceData).result());
    assertTrue(performanceData.comparations() > 10);
    assertTrue(performanceData.switches() > 1);
  }
}
