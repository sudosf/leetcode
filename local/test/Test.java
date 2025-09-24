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
    int[] moreNuma = new int[] {0, 1, 1};

    IO.println("triplets: " + twoPointerApproach(nums));
    IO.println("triplets: " + twoPointerApproach(moreNuma));
  }

  List<List<Integer>> twoPointerApproach(int[] nums) {

    List<List<Integer>> triplets = new ArrayList<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;

      int left = i + 1, right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
          triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));

          int currentLeft = nums[left];
          while (left < right && currentLeft == nums[left])
            left++;

          int currentRight = nums[right];
          while (left < right && currentRight == nums[right])
            right--;
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }

    return triplets;
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
