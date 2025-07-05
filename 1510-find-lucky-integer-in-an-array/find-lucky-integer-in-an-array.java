class Solution {
    public int findLucky(int[] arr) {
        //counting the frequency 
        HashMap<Integer,Integer> hh=new HashMap<>();
        for(int a:arr){
            hh.put(a,hh.getOrDefault(a,0)+1);
        }
        List<Integer> ll=new ArrayList<>();
        for(int b:hh.keySet()){
            if(hh.get(b)==b){
                ll.add(b);
            }
        }
        if(ll.size()>0){
            return Collections.max(ll);
        }else{
            return -1;
        }
        
    }
}