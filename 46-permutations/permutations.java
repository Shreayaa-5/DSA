class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        backtrack(nums,n,a,l,new boolean[nums.length]);
        return a;
    }
    public void backtrack(int[] nums,int count,List<List<Integer>> result,List<Integer> l,boolean[] used){
        if(l.size()==count){
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<count;i++){
            if(used[i]){
                continue;
            }
            l.add(nums[i]);
            used[i]=true;
            backtrack(nums,count,result,l,used);
            used[i]=false;
            l.remove(l.size()-1);
        }

        
    }
}