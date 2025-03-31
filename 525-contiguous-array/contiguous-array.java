class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int longest=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum += (nums[i] == 0) ? -1 : 1;
             if(sum==0){
                longest=Math.max(longest,i+1);
             }else if(map.containsKey(sum)){
                longest=Math.max(longest,i-map.get(sum));
             }
             else{
                map.put(sum,i);
             }
             
        }
        return longest;
    }
}