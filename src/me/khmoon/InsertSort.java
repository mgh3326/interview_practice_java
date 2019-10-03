package me.khmoon;

public class InsertSort {
  public static void main(String[] args) {
    int[] data = {4, 54, 2, 8, 63, 7, 55, 56};
    int[] outputArr = insertSort(data);
    for (int i : outputArr) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  private static int[] insertSort(int[] data) {
    int[] outArr = data.clone();
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
