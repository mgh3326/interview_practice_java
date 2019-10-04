package me.khmoon;

import java.util.ArrayList;

public class QuickSort {

  public int[] sort(int[] inputArr) {
    int[] outputArr = inputArr.clone();
    _quickSort(outputArr, 0, outputArr.length);
    //분할

    //정복
    return outputArr;
  }

  private void _quickSort(int[] outputArr, int left, int right) {
    if (right - left < 2) {
      return;
    }
    int[] tempArr = new int[right - left];
    int pivotIndex = left; // TODO pivoting 필요
    int pivotValue = outputArr[pivotIndex];
    int leftIndex = 0;
    int rightIndex = right - left - 1;
    for (int i = left; i < right; i++) {
      if (i == pivotIndex) {
        continue;
      }
      if (outputArr[i] < pivotValue) {
        tempArr[leftIndex] = outputArr[i];
        leftIndex++;
      } else {
        tempArr[rightIndex] = outputArr[i];
        rightIndex--;
      }
    }
    // left index랑 right index가 같아짐
    for (int i = left; i < right; i++) {
      if (i == leftIndex + left) {
        outputArr[i] = pivotValue;
      } else {
        outputArr[i] = tempArr[i - left];
      }
    }
    _quickSort(outputArr, left, leftIndex + left);
    _quickSort(outputArr, leftIndex + left + 1, right);
  }
}
