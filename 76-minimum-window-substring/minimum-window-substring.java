class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[128];   // Use full ASCII range
        int[] fhash = new int[128];  // Use full ASCII range
        int l = 0, minLen = Integer.MAX_VALUE, start = 0;
        int count = t.length();

        for (int i = 0; i < t.length(); i++) {
            fhash[t.charAt(i)]++;
        }

        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            hash[rightChar]++;
            
            if (fhash[rightChar] > 0 && hash[rightChar] <= fhash[rightChar]) {
                count--;
            }

            while (count == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);
                hash[leftChar]--;
                if (fhash[leftChar] > 0 && hash[leftChar] < fhash[leftChar]) {
                    count++;
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
