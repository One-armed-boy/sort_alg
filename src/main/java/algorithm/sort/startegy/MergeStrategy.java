package algorithm.sort.startegy;

import java.util.Arrays;

public class MergeStrategy implements SortStrategy{
  @Override
  public void sort(int[] arr) {
    mergeSort(arr);
  }

  private int[] mergeSort(int[] arr) {
    if (arr.length < 2) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));


    int leftArrIdx = 0;
    int rightArrIdx = 0;
    int mergeArrIdx = 0;
    while (leftArrIdx < leftArr.length && rightArrIdx < rightArr.length) {
      if (leftArr[leftArrIdx] <= rightArr[rightArrIdx]) {
        arr[mergeArrIdx++] = leftArr[leftArrIdx++];
      } else {
        arr[mergeArrIdx++] = rightArr[rightArrIdx++];
      }
    }
    while (leftArrIdx < leftArr.length) {
      arr[mergeArrIdx++] = leftArr[leftArrIdx++];
    }
    while (rightArrIdx < rightArr.length) {
      arr[mergeArrIdx++] = rightArr[rightArrIdx++];
    }

    return arr;
  }
}
