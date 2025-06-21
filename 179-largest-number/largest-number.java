class Solution {
    public String largestNumber(int[] nums) {
        String str="";
        List<String> l=new ArrayList<>();
        for(int num:nums){
            l.add(String.valueOf(num));
        }
        l.sort((str1,str2)->(str2+str1).compareTo(str1+str2));

        if("0".equals(l.get(0))){
            return "0";
        }
        return String.join("",l);
    }
}