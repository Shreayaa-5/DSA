class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<=arr.length-3;i++){
            boolean odd=true;
            for(int j=0;j<3;j++){
                if(arr[i+j]%2==0){
                    odd=false;
                    break;
                }
            }
            if(odd==true){
                return true;
            }
        }
        return false;
    }
}