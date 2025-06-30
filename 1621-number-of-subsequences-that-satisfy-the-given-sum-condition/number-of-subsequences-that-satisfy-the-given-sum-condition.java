public class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int MOD = 1_000_000_007;
        
        // 1) Sort the array to use two-pointer technique
        Arrays.sort(nums);
        
        // 2) Precompute powers of 2 mod MOD: pow2[i] = 2^i % MOD
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for(int i = 1; i < n; i++){
            pow2[i] = (pow2[i-1] * 2) % MOD;
        }
        
        int left = 0, right = n - 1;
        int ans = 0;
        
        // 3) Two-pointer sweep
        while (left <= right) {
            // If the smallest (nums[left]) + largest (nums[right]) is within target
            if (nums[left] + nums[right] <= target) {
                // All subsequences using nums[left] as min and any of nums[left+1..right] are valid
                // Count is 2^(right-left) (choose any subset of the (right-left) other elements)
                ans = (ans + pow2[right - left]) % MOD;
                left++;  // move left pointer up to next element
            } else {
                // If sum too large, decrease the largest element
                right--;
            }
        }
        
        return ans;
    }
}