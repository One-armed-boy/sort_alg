package algorithm.sort;

import algorithm.sort.startegy.SortStrategy;

public class ArraySorter {
  private SortStrategy sortStrategy;
  public void setSortStrategy(SortStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
  }
  public void sort(int[] arr) {
    if (sortStrategy == null) {
      throw new RuntimeException("소팅 전략을 설정해주세요.");
    }
    sortStrategy.sort(arr);
  }
}
