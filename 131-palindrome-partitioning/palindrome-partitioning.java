class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> l = new ArrayList<>();
        backtrack(s, result, l, 0);
        return result;
    }

    public void backtrack(String s, List<List<String>> result, List<String> l, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(l)); // Copy the list before adding
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String pal = s.substring(start, i);
            if (palindrome(pal)) {
                l.add(pal);
                backtrack(s, result, l, i);
                l.remove(l.size() - 1); // Backtrack
            }
        }
    }

    public boolean palindrome(String pl) {
        for (int i = 0; i < pl.length() / 2; i++) {
            if (pl.charAt(i) != pl.charAt(pl.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
