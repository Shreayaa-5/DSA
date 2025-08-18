class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=0;
        int n=nums.length;
        HashMap<Integer,Integer> hh=new HashMap<>();
        for(int i=0;i<n;i++){
            hh.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            if(hh.containsKey(target-nums[i]) && hh.get(target-nums[i])!=i){
                return new int[]{hh.get(target-nums[i]),i};
            }
        }
        return new int[]{};
    }
}