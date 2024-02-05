package algorithm.sort.startegy;

public class SelectionStrategy implements SwapSortStrategy{
  @Override
  public void sort(int[] arr) {
    for (int sortedIdx = 0; sortedIdx < arr.length; sortedIdx++) {
      int minIdx = sortedIdx;
      int minValue = Integer.MAX_VALUE;
      for (int idx = sortedIdx; idx < arr.length; idx++) {
        if (arr[idx] >= minValue) {
          continue;
        }
        minIdx = idx;
        minValue = arr[idx];
      }
      swap(arr, minIdx, sortedIdx);
    }
  }

}
