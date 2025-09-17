package local.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

  void main() {
    String str = "hello";

    Map<Set<Integer>, Integer> cache = new HashMap<>();

    // create array of ASCII from string
    int[] asciiArray = str.chars().toArray();

    int sum = 0;
    for (int i = 0; i < asciiArray.length - 1; i++) {
      Set<Integer> pair = Stream.of(asciiArray[i], asciiArray[i + 1]).collect(Collectors.toSet());

      if (cache.containsKey(pair)) {
        sum += cache.get(pair);
        continue;
      }

      int result = Math.abs(asciiArray[i] - asciiArray[i + 1]);
      cache.put(pair, result);
      sum += result;
    }

    IO.println("sum: " + sum);
  }
}
