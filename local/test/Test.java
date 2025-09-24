package local.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

  void main() {

    int[] nums = new int[] {-1, 0, 1, 2, -1, -4};

    IO.println("triplets: " + threeSum(nums));
  }

  List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> triplets = new ArrayList<>();
    Map<Integer, Integer> freq = new HashMap<>();

    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    // Arrays.sort(nums);
    for (int left = 0; left < nums.length; left++) {
      int numOne = nums[left];

      for (int right = left + 1; right < nums.length; right++) {
        int numTwo = nums[right];
        int complement = -(numOne + numTwo);

        if (freq.containsKey(complement)) {
          int occurrences = 1; // we need at least 1 occurrence of complement

          if (complement == numOne)
            occurrences++;
          if (complement == numTwo)
            occurrences++;

          if (freq.get(complement) >= occurrences) {
            // valid — complement exists without reusing the same index
            List<Integer> triplet = Arrays.asList(numOne, numTwo, complement);
            Collections.sort(triplet); // normalize order

            if (!triplets.contains(triplet)) {
              triplets.add(triplet);
            }
            // triplets.add(new ArrayList<>(Arrays.asList(numOne, numTwo, complement)));
          }
        }

      }
    }

    return triplets;
  }
}
