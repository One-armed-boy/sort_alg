package algorithm.sort.startegy;

public class BubbleStrategy implements SwapSortStrategy {
  @Override
  public void sort(int[] arr) {
    for (int lastIdx = arr.length - 1; lastIdx > 0; lastIdx --) {
      for (int idx = 0; idx <= lastIdx - 1; idx++) {
        if (arr[idx] <= arr[idx+1]) {
          continue;
        }
        swap(arr, idx, idx+1);
      }
    }
  }
}
