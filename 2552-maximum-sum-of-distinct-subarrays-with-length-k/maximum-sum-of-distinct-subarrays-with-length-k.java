class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int len = nums.length;
        long add = 0;
        for (int i = 0; i < k; i++) {
            add += nums[i];
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        long max = 0;
        if (mp.size() == k) {
            max = add;
        }
        for (int i = k; i < len; i++) {
            add += nums[i] - nums[i - k];
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            mp.put(nums[i - k], mp.get(nums[i - k]) - 1);
            if (mp.get(nums[i - k]) == 0) {
                mp.remove(nums[i - k]);
            }
            if (mp.size() == k) {
                max = Math.max(max, add);
            }
        }
        return max;
    }
}
