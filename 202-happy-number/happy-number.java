class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(true){
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum+=dig*dig;
                System.out.println(dig);
                n/=10;
            }
            if(sum==1) return true;

            n=sum;
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
        }
    }
}