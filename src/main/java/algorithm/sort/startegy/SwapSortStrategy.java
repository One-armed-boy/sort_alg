package algorithm.sort.startegy;

public interface SwapSortStrategy extends SortStrategy{
  default void swap(int[] arr, int idx1, int idx2) {
    int tmp1 = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp1;
  }
}
