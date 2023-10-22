package org.example;

import java.util.Random;
import java.util.stream.IntStream;

public class NumberGeneration {

  private static final Random RANDOM = new Random();

  private NumberGeneration() {}

  public static int[] getOrderedNumbers(final int size) {
    return IntStream.rangeClosed(1, size).boxed().mapToInt(i -> i).toArray();
  }

  public static int[] getInvertedNumbers(final int size) {

    int[] result = getOrderedNumbers(size);

    return IntStream.rangeClosed(1, size)
        .boxed()
        .mapToInt(i -> result[size - i])
        .toArray();
  }

  public static int[] getRandomNumbers(final int size) {
    return RANDOM.ints(size, 1, 100000).toArray();
  }
}
