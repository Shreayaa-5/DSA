class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int need=tickets[k];
        Queue<Pair<Integer,Boolean>> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            if(i==k){
                q.add(new Pair<>(tickets[i],true));
                continue;
            }
            q.offer(new Pair<>(tickets[i],false));
        }
        int time=0;
        
            while(!q.isEmpty()){
                Pair<Integer, Boolean> p = q.poll();
                time++;
                int n=p.getKey()-1;
                System.out.println(n);
                if(n>0){
                    q.offer(new Pair<>(n,p.getValue()));
                }
                else if(p.getValue()==true && n==0){
                    System.out.println("HEYYY");
                    return time;
                }
                
        }
        return time;
        
    }
}