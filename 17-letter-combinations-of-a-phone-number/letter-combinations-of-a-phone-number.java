class Solution {
    private static final Map<Character,String> map=Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        //edge cases
        if(digits==null || digits.length()==0){
            return result;
        }
        //edge case to check if digit is in phone
        for(char ch:digits.toCharArray()){
            if(!map.containsKey(ch)){
                return result;
            }
        }
        backtracking(digits,0,new StringBuilder(),result) ;
        return result;        
    }
    public static void backtracking(String digits,int index,StringBuilder current,List<String> result){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        char dig=digits.charAt(index);
        String letters=map.get(dig);
        for(char l:letters.toCharArray()){
            current.append(l); 
            backtracking(digits,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
}