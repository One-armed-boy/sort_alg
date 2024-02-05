package algorithm.sort;

import algorithm.sort.startegy.BubbleStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraySorterTest {
  private ArraySorter arrSorter = new ArraySorter();
  @Test
  @DisplayName("버블 소트")
  void bubbleSort() {
    // given
    int[] testArr = getRandomArrForTest(10, 0, 20);
    arrSorter.setSortStrategy(new BubbleStrategy());

    // when
    arrSorter.sort(testArr);

    // then
    Assertions.assertEquals(checkSortingAsc(testArr), true);
  }
  private int[] getRandomArrForTest(int len, int start, int end) {
    return Arrays.stream(new int[len]).map(e -> {
      return (int) (Math.random() * (end - start)) + start;
    }).toArray();
  }
  private boolean checkSortingAsc(int[] arr) {
    for (int idx = 0; idx < arr.length - 1; idx++) {
      if (arr[idx] > arr[idx+1]) {
        return false;
      }
    }
    return true;
  }
}
