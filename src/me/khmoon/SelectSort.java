package me.khmoon;

public class SelectSort {
  public static void main(String[] args) {
    int[] data = {4, 54, 2, 8, 63, 7, 55, 56};
    int[] outputArr = selectSort(data);
    for (int i : outputArr) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  private static int[] selectSort(int[] data) {
    int[] outArr = data.clone();
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
