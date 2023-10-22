package org.example;

import static org.example.BubbleSort.ascendingBubbleSort3rdVersion;
import static org.example.BubbleSort.ascendingBubbleSort1stVersion;
import static org.example.BubbleSort.ascendingBubbleSort2ndVersion;

public class Main {

  private static final int[] ORDERED_NUMBERS = NumberGeneration.getOrderedNumbers(10000);
  private static final int[] INVERTED_NUMBERS = NumberGeneration.getInvertedNumbers(10000);
  private static final int[] RANDOM_NUMBERS = NumberGeneration.getRandomNumbers(10000);

  public static void main(String[] args) {

    PerformanceData[] bubbleSortResults = runBubbleSort();
    PerformanceData[] improvedBubbleSortResults = runImprovedBubbleSort();
    PerformanceData[] bestBubbleSortResults = runBestBubbleSort();

    compareResults(bubbleSortResults, improvedBubbleSortResults, bestBubbleSortResults);
  }

  private static PerformanceData[] runBubbleSort() {

    PerformanceData orderedBubbleSortResult = ascendingBubbleSort1stVersion(ORDERED_NUMBERS);
    PerformanceData invertedBubbleSortResult = ascendingBubbleSort1stVersion(INVERTED_NUMBERS);
    PerformanceData randomBubbleSortResult = ascendingBubbleSort1stVersion(RANDOM_NUMBERS);

    return new PerformanceData[] {
      orderedBubbleSortResult, invertedBubbleSortResult, randomBubbleSortResult
    };
  }

  private static PerformanceData[] runImprovedBubbleSort() {

    PerformanceData orderedImprovedBubbleSortResult = ascendingBubbleSort2ndVersion(ORDERED_NUMBERS);
    PerformanceData invertedImprovedBubbleSortResult =
        ascendingBubbleSort2ndVersion(INVERTED_NUMBERS);
    PerformanceData randomImprovedBubbleSortResult = ascendingBubbleSort2ndVersion(RANDOM_NUMBERS);

    return new PerformanceData[] {
      orderedImprovedBubbleSortResult,
      invertedImprovedBubbleSortResult,
      randomImprovedBubbleSortResult
    };
  }

  private static PerformanceData[] runBestBubbleSort() {

    PerformanceData orderedBestBubbleSortResult = ascendingBubbleSort3rdVersion(ORDERED_NUMBERS);
    PerformanceData invertedBestBubbleSortResult = ascendingBubbleSort3rdVersion(INVERTED_NUMBERS);
    PerformanceData randomBestBubbleSortResult = ascendingBubbleSort3rdVersion(RANDOM_NUMBERS);

    return new PerformanceData[] {
      orderedBestBubbleSortResult, invertedBestBubbleSortResult, randomBestBubbleSortResult
    };
  }

  private static void compareResults(
      final PerformanceData[] bubbleSortResult,
      final PerformanceData[] improvedBubbleSortResult,
      final PerformanceData[] bestBubbleSortResult) {

    String leftAlignFormat = "| %-23s | %-20d | %-20d | %-20d |%n";

    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n");
    System.out.format("| Comparations            | 10k ordered numbers  | 10k inverted numbers | 10k random numbers   |%n");
    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n");

    System.out.format(leftAlignFormat, "Bubble Sort 1st Version",
        bubbleSortResult[0].comparations(),
        bubbleSortResult[1].comparations(),
        bubbleSortResult[2].comparations());

    System.out.format(leftAlignFormat, "Bubble Sort 2nd Version",
        improvedBubbleSortResult[0].comparations(),
        improvedBubbleSortResult[1].comparations(),
        improvedBubbleSortResult[2].comparations());

    System.out.format(leftAlignFormat, "Bubble Sort 3rd Version",
        bestBubbleSortResult[0].comparations(),
        bestBubbleSortResult[1].comparations(),
        bestBubbleSortResult[2].comparations());

    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n%n");

    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n");
    System.out.format("| Switches                | 10k ordered numbers  | 10k inverted numbers | 10k random numbers   |%n");
    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n");

    System.out.format(leftAlignFormat, "Bubble Sort 1st Version",
        bubbleSortResult[0].switches(),
        bubbleSortResult[1].switches(),
        bubbleSortResult[2].switches());

    System.out.format(leftAlignFormat, "Bubble Sort 2nd Version",
        improvedBubbleSortResult[0].switches(),
        improvedBubbleSortResult[1].switches(),
        improvedBubbleSortResult[2].switches());

    System.out.format(leftAlignFormat, "Bubble Sort 3rd Version",
        bestBubbleSortResult[0].switches(),
        bestBubbleSortResult[1].switches(),
        bestBubbleSortResult[2].switches());

    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n%n");

    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n");
    System.out.format("| Execution Time          | 10k ordered numbers  | 10k inverted numbers | 10k random numbers   |%n");
    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n");

    System.out.format(leftAlignFormat, "Bubble Sort 1st Version",
        bubbleSortResult[0].executionTime(),
        bubbleSortResult[1].executionTime(),
        bubbleSortResult[2].executionTime());

    System.out.format(leftAlignFormat, "Bubble Sort 2nd Version",
        improvedBubbleSortResult[0].executionTime(),
        improvedBubbleSortResult[1].executionTime(),
        improvedBubbleSortResult[2].executionTime());

    System.out.format(leftAlignFormat, "Bubble Sort 3rd Version",
        bestBubbleSortResult[0].executionTime(),
        bestBubbleSortResult[1].executionTime(),
        bestBubbleSortResult[2].executionTime());

    System.out.format("+-------------------------+----------------------+----------------------+----------------------+%n%n");
  }
}
