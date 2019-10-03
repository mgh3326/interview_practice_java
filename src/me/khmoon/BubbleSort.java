package me.khmoon;

public class BubbleSort {

  static int[] bubbleSort(int[] inputArr) {
    int[] outArr = inputArr.clone();
    for (int i = 0; i < outArr.length; i++) {
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

  public static void main(String[] args) {
    int[] data = {4, 54, 2, 8, 63, 7, 55, 56};
    int[] outputArr = bubbleSort(data);
    for (int i : outputArr) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }
}
