class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> l=new ArrayList<>();
        HashSet<List<Integer>> result=new HashSet<>();
        backtrack(candidates,target,result,l,0);
        return new ArrayList<>(result);
    }
    public void backtrack(int[] candidates,int target,HashSet<List<Integer>> result,List<Integer> l,int sum){
        if(sum==target){
            List<Integer> sorted = new ArrayList<>(l);
            Collections.sort(sorted);
            result.add(sorted);
            return;
        }
        for(int i=0;i<candidates.length;i++){
            if(sum>target){
                return;
            }
            l.add(candidates[i]);
            sum+=candidates[i];
            backtrack(candidates,target,result,l,sum);
            sum-=candidates[i];
            l.remove(l.size()-1);
            
        }
    }
}