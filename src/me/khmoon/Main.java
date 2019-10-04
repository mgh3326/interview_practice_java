package me.khmoon;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] inputArr = {4, 54, 2, 8, 63, 7, 55, 56};
    System.out.println("inputArr = " + Arrays.toString(inputArr));
    BubbleSort bubbleSort = new BubbleSort();
    int[] bubbleSortOutputArr = bubbleSort.sort(inputArr);
    System.out.println("bubbleSortOutputArr = " + Arrays.toString(bubbleSortOutputArr));
    SelectSort selectSort = new SelectSort();
    int[] selectSortOutputArr = selectSort.sort(inputArr);
    System.out.println("selectSortOutputArr = " + Arrays.toString(selectSortOutputArr));
    InsertSort insertSort = new InsertSort();
    int[] insertSortOutputArr = insertSort.sort(inputArr);
    System.out.println("insertSortOutputArr = " + Arrays.toString(insertSortOutputArr));
    MergeSort mergeSort = new MergeSort();
    int[] mergeSortOutputArr = mergeSort.sort(inputArr);
    System.out.println("mergeSortOutputArr = " + Arrays.toString(mergeSortOutputArr));
      QuickSort quickSort = new QuickSort();
      int[] quickSortOutputArr =      quickSort.sort(inputArr);
  }
}
