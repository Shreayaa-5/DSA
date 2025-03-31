class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count =0;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remainder=(sum%k+k)%k;
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}