package local.test;

import java.util.Arrays;

public class Test {

  void main() {
    int[] arr = new int[] {5,0,1,2,3,4};

    int len = arr.length;
    for (int i = 0; i < len; i++) {
      int original = arr[i] % len;
      arr[i] = original + ((arr[arr[i]] % len) * len);
    }

    IO.println("pure encoded []: " + Arrays.toString(arr));

    IO.println();
    for (int num : arr) {
      IO.println("old: " + num % len);
    }

    IO.println();
    for (int num : arr) {
      IO.println("new: " + num / len);
    }
  }
}
