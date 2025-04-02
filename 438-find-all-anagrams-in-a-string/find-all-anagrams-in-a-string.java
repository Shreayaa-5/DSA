import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] hash = new int[26];
        int[] phash = new int[26];
        int window = p.length();
        int len = s.length();

        if (len < window) return ans;  // Edge case: If s is smaller than p, return empty list

        int right = 0, left = 0;

        // Initialize frequency arrays for the first window
        while (right < window) {
            phash[p.charAt(right) - 'a']++;
            hash[s.charAt(right) - 'a']++;
            right++;
        }

        // Sliding window process
        while (right < len) {
            if (Arrays.equals(phash, hash)) {
                ans.add(left);  // Found an anagram
            }

            // Move window forward
            hash[s.charAt(left) - 'a']--;  // Remove the leftmost character
            if (right < len) {
                hash[s.charAt(right) - 'a']++;  // Add the new right character
            }
            left++;
            right++;
        }

        // Final check after the loop for the last window
        if (Arrays.equals(phash, hash)) {
            ans.add(left);
        }

        return ans;
    }
}
