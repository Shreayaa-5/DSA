class FindSumPairs {
    int[] n1,n2;
    Map<Integer,Integer> m=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1=nums1;
        n2=nums2;
        for(int n:nums2){
            m.put(n,m.getOrDefault(n,0)+1);
        }
    }
    public void add(int index, int val) {
        m.put(n2[index],m.get(n2[index])-1);
        n2[index]=n2[index]+val;
        m.put(n2[index],m.getOrDefault(n2[index],0)+1);
    }
    public int count(int tot) {
        int count=0;
        for(int a:n1){
            count+=m.getOrDefault(tot-a,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */