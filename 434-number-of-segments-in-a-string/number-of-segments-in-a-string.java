class Solution {
    public int countSegments(String s) {
        String[] ss=s.split(" ");
        int count=0;
        if(s.length()==0){
            return 0;
        }
        for(String a:ss){
            if(a!=""){
                System.out.println(a);
                count++;
            }
        }
        return count;
    }
}