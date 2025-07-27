class Solution {
    public int romanToInt(String s) {
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (values[s.charAt(i)] < values[s.charAt(i + 1)]) {
                ans -= values[s.charAt(i)];
            } else {
                ans += values[s.charAt(i)];
            }
        }

        return ans + values[s.charAt(s.length() - 1)];
    }
}
