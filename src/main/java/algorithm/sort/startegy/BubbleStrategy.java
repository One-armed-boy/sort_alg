package algorithm.sort.startegy;

public class BubbleStrategy implements SortStrategy {
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

  private void swap(int[] arr, int idx1, int idx2) {
    int tmp1 = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp1;
  }
}
