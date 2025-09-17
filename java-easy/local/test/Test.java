package local.test;

import java.util.Arrays;

public class Test {

  void main() {
    String str = "hello";

    // create array of ASCII from string
    int[] asciiArray = str.chars().toArray();

    int sum = 0;
    for (int i = 0; i < asciiArray.length - 1; i++) {
      IO.println("i: " + i + "code: " + asciiArray[i] + " - " + asciiArray[i + 1]);
      sum += Math.abs(asciiArray[i] - asciiArray[i + 1]);
    }

    IO.println("sum: " + sum);
  }
}
