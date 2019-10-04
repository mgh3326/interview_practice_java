package me.khmoon;

public class InsertSort {
  public int[] sort(int[] inputArr) {
    int[] outArr = inputArr.clone();
    for (int i = 1; i < outArr.length; i++) {
      int current_index = i;
      while (current_index != 0) {
        if (outArr[current_index] > outArr[current_index - 1]) {
          break;
        }
        int tempValue = outArr[current_index];
        outArr[current_index] = outArr[current_index - 1];
        outArr[current_index - 1] = tempValue;
        current_index--;
      }
    }
    return outArr;
  }
}
