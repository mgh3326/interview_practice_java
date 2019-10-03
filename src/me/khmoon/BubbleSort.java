package me.khmoon;

public class BubbleSort {

  static int[] bubbleSort(int[] inputArr) {
    return inputArr;
  }

  public static void main(String[] args) {
    int[] data = {4, 54, 2, 8, 63, 7, 55, 56};
    int[] outArr = bubbleSort(data);
    for (int i : outArr) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }
}
