package me.khmoon;

public class BubbleSort {

  public int[] sort(int[] inputArr) {
    int[] outArr = inputArr.clone();
    for (int i = 0; i < outArr.length - 1; i++) {
      for (int j = 0; j < outArr.length - 1 - i; j++) {
        if (outArr[j] > outArr[j + 1]) {
          int tempValue = outArr[j];
          outArr[j] = outArr[j + 1];
          outArr[j + 1] = tempValue;
        }
      }
    }
    return outArr;
  }
}
