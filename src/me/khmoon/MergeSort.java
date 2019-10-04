package me.khmoon;

public class MergeSort {
  //https://www.daleseo.com/sort-merge/ 참고해서 최적화를 해보도록 하자 (완료)
  public int[] sort(int[] data) {
    int[] outArr = data.clone();

    // 메모리를 추가해서 만들지 않고, 배열 순서만 변경하는 mergeSort (In-place sort)
    _mergeSort(outArr, 0, outArr.length);
    return outArr;
  }

  private static void _mergeSort(int[] outArr, int left, int right) {
    //divide
    if (right - left < 2) {
      return;
    }
    int mid = (right + left) / 2;
    _mergeSort(outArr, left, mid);
    _mergeSort(outArr, mid, right);
    // merge
    int[] tempArr = new int[right - left];
    int leftIndex = left;
    int rightIndex = mid;
    int currentIndex = 0;
    while (true) {
      if (leftIndex == mid) {
        while (rightIndex != right) {
          tempArr[currentIndex] = outArr[rightIndex];
          rightIndex++;
          currentIndex++;
        }
        break;
      }
      if (rightIndex == right) {
        while (leftIndex != mid) {
          tempArr[currentIndex] = outArr[leftIndex];
          leftIndex++;
          currentIndex++;
        }
        break;
      }
      if (outArr[leftIndex] < outArr[rightIndex]) {
        tempArr[currentIndex] = outArr[leftIndex];
        leftIndex++;
      } else {
        tempArr[currentIndex] = outArr[rightIndex];
        rightIndex++;
      }
      currentIndex++;
    }
    for (int i = 0; i < tempArr.length; i++) {
      outArr[left + i] = tempArr[i];
    }
  }

}
