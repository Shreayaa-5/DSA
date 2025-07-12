class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> h=new LinkedHashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int num:h.keySet()){
            nums[j++]=num;
        }
        return j;

    }
}