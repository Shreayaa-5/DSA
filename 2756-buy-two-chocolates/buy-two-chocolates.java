class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int amount=money;
        int c=0;
        for(int a:prices){
            if(a<=money && c<2){
                c++;
                money-=a;
            }
            
        }
        return c==2 ? money : amount;

    }
}