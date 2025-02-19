import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> second = new HashMap<>();
        
        // Count character frequencies in magazine
        for (char i : magazine.toCharArray()) {
            second.put(i, second.getOrDefault(i, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char i : ransomNote.toCharArray()) {
            if (!second.containsKey(i) || second.get(i) == 0) {
                return false;
            }
            second.put(i, second.get(i) - 1); // Reduce count of used character
        }

        return true;
    }
}
