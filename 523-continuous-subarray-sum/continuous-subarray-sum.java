import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1); // Handle case where subarray sum itself is a multiple of k

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = (sum % k + k) % k; // Normalize remainder to be positive

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) > 1) return true;
            } else {
                map.put(remainder, i); // Store only the first occurrence
            }
        }
        return false;
    }
}
