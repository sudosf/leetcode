package local.test;

import java.util.Arrays;

public class Test {

  void main() {
    int[] arr = new int[] {-1, 0, 3, 5, 9, 12};

    IO.println("index: " + search(arr, 9));
  }

  public int search(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
