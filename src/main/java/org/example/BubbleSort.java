package org.example;

import java.util.Arrays;

public class BubbleSort {

  private BubbleSort() {}

  public static PerformanceData ascendingBubbleSort1stVersion(final int[] input) {

    int[] result = Arrays.copyOf(input, input.length);
    long startTime = System.nanoTime();
    int comparations = 0;
    int switches = 0;
    int aux;

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j <= result.length - 2; j++) {
        comparations++;

        if (result[j] > result[j + 1]) {
          switches++;

          aux = result[j];
          result[j] = result[j + 1];
          result[j + 1] = aux;
        }
      }
    }

    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;

    return new PerformanceData(result, comparations, switches, executionTime);
  }

  public static PerformanceData ascendingBubbleSort2ndVersion(final int[] input) {

    int[] result = Arrays.copyOf(input, input.length);
    long startTime = System.nanoTime();
    int comparations = 0;
    int switches = 0;
    int aux;

    for (int i = 1; i <= result.length - 1; i++) {
      for (int j = result.length - 1; j >= i; j--) {
        comparations++;

        if (result[j] < result[j - 1]) {
          switches++;

          aux = result[j];
          result[j] = result[j - 1];
          result[j - 1] = aux;
        }
      }
    }

    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;

    return new PerformanceData(result, comparations, switches, executionTime);
  }

  public static PerformanceData ascendingBubbleSort3rdVersion(final int[] input) {

    int[] result = Arrays.copyOf(input, input.length);
    long startTime = System.nanoTime();
    int comparations = 0;
    int switches = 0;
    int aux;
    boolean hadSwitch = true;
    int remainingIterations = result.length;

    while (hadSwitch && remainingIterations > 0) {
      hadSwitch = false;

      for (int i = 0; i <= result.length - 2; i++) {
        comparations++;

        if (result[i] > result[i + 1]) {
          switches++;
          hadSwitch = true;

          aux = result[i];
          result[i] = result[i + 1];
          result[i + 1] = aux;
        }
      }

      remainingIterations--;
    }

    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;

    return new PerformanceData(result, comparations, switches, executionTime);
  }
}
