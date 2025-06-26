class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashSet<List<Integer>> result=new HashSet<>();
        backtrack(nums,nums.length,result,l,0);
        return new ArrayList<>(result);
    }
    public void backtrack(int[] nums,int count,HashSet<List<Integer>> result,List<Integer> l,int start){
        result.add(new ArrayList<>(l));
        for(int i=start;i<count;i++){
            l.add(nums[i]);
            backtrack(nums,count,result,l,i+1);
            l.remove(l.size()-1);
        }
    }
}