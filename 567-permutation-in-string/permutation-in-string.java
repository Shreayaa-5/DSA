import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] phash = new int[26];  // Frequency of characters in s1
        int[] hash = new int[26];   // Frequency of current window in s2

        int plen = s1.length();
        int hlen = s2.length();

        // Initialize the frequency array for the first window
        for (int i = 0; i < plen; i++) {
            phash[s1.charAt(i) - 'a']++;
            hash[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(hash, phash)) return true;

        // Sliding window approach
        for (int i = plen; i < hlen; i++) {
            hash[s2.charAt(i) - 'a']++;       // Add the new character to the window
            hash[s2.charAt(i - plen) - 'a']--; // Remove the old character from the window

            if (Arrays.equals(hash, phash)) return true;
        }

        return false;
    }
}
