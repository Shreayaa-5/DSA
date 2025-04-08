class Solution {
    public int characterReplacement(String s, int k) {

    int left = 0, maxCount = 0, maxLength = 0;
    int[] count = new int[26];
    
    for (int right = 0; right < s.length(); right++) {
        // Increment character count for the character at 'right'
        maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
        
        // Window size: right - left + 1
        // Calculate if replacements exceed k
        if (right - left + 1 - maxCount > k) {
            count[s.charAt(left) - 'A']--;
            left++;
        }
        
        // Update maximum length of the window
        maxLength = Math.max(maxLength, right - left + 1);
    }
    
    return maxLength;
}
    
}