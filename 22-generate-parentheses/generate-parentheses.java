class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(n,result,0,0,"");
        return result;
    }
    public void backtrack(int n,List<String> result,int open,int close,String current){
        if(current.length()==n*2){
            result.add(current);
        }
        if(open<n){
            backtrack(n,result,open+1,close,current+'(');
        }if(close<open){
            backtrack(n,result,open,close+1,current+')');
        }
    }
}