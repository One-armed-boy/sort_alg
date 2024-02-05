package algorithm.sort.startegy;

public class QuickStrategy implements SwapSortStrategy{
  @Override
  public void sort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int leftIdx, int rightIdx) {
    if (leftIdx >= rightIdx) {
      return;
    }

    int pivot = arr[rightIdx];

    int sortedIdx = leftIdx;
    for (int idx = leftIdx; idx < rightIdx; idx++) {
      if (arr[idx] > pivot) {
        continue;
      }
      swap(arr, idx, sortedIdx);
      sortedIdx++;
    }

    swap(arr, sortedIdx, rightIdx);
    quickSort(arr, leftIdx, sortedIdx - 1);
    quickSort(arr, sortedIdx + 1, rightIdx);
  }
}
