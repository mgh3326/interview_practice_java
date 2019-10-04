package me.khmoon;

public class SelectSort {


  public int[] sort(int[] inputArr) {
    int[] outArr = inputArr.clone();
    for (int i = 0; i < outArr.length - 1; i++) {
      int tempMinIndex = i;
      for (int j = i + 1; j < outArr.length; j++) {
        if (outArr[tempMinIndex] > outArr[j]) {
          tempMinIndex = j;
        }
      }
      if (i != tempMinIndex) {
        int tempValue = outArr[i];
        outArr[i] = outArr[tempMinIndex];
        outArr[tempMinIndex] = tempValue;
      }

    }
    return outArr;
  }
}
