package algorithm.sort.startegy;

public class InsertionStrategy implements SwapSortStrategy{
  @Override
  public void sort(int[] arr) {
    for (int idx = 1; idx < arr.length; idx++) {
      int targetIdx = idx;
      int compareIdx = targetIdx - 1;
      while (targetIdx > 0 && arr[targetIdx] < arr[compareIdx]) {
        swap(arr, targetIdx--, compareIdx--);
      }
    }
  }
}
