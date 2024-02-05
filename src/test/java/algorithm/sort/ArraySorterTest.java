package algorithm.sort;

import algorithm.sort.startegy.BubbleStrategy;
import algorithm.sort.startegy.MergeStrategy;
import algorithm.sort.startegy.SortStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraySorterTest {
  private ArraySorter arrSorter = new ArraySorter();
  @Test
  @DisplayName("버블 소트")
  void bubbleSort() {
    sortTest(new BubbleStrategy());
  }
  @Test
  @DisplayName("머지 소트")
  void mergeSort() {
    sortTest(new MergeStrategy());
  }

  private void sortTest(SortStrategy sortStrategy) {
    // given
    int[] testArr = getRandomArrForTest(1000, 0, 10000);
    arrSorter.setSortStrategy(sortStrategy);

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
