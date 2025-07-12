class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length/2;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int a:nums){
            count.put(a,count.getOrDefault(a,0)+1);
        }
        for(int a:count.keySet()){
            if(count.get(a)>size){
                return a;
            }
        }
        return 99;
    }
}