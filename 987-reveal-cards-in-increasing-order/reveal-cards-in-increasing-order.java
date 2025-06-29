class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        int[] result=new int[deck.length];
        for(int a:deck){
            int index=q.poll();
            result[index]=a;
            System.out.println("Index :"+index+" value :"+a);
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return result;
    }
}