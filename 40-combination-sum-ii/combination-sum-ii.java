import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Important to skip duplicates
        List<Integer> l = new ArrayList<>();
        HashSet<List<Integer>> result = new HashSet<>();
        backtrack(candidates, target, result, l, 0, 0, new boolean[candidates.length]);
        return new ArrayList<>(result);
    }

    public void backtrack(int[] candidates, int target, HashSet<List<Integer>> result,
                          List<Integer> l, int sum, int start, boolean[] used) {
        if (sum == target) {
            result.add(new ArrayList<>(l));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1] && !used[i - 1]) continue;

            if (sum + candidates[i] > target) continue;

            l.add(candidates[i]);
            used[i] = true;
            backtrack(candidates, target, result, l, sum + candidates[i], i + 1, used);
            used[i] = false;
            l.remove(l.size() - 1);
        }
    }
}
