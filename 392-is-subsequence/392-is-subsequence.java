class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
       int bi = 0;
        
        while(si<s.length()&&bi<t.length()){
            if(s.charAt(si)==t.charAt(bi)){
                si++;
                bi++;
            }
            else{
                bi++;
            }
        }
        
        if(si>=s.length()){
            return true;
        }
        return false;
    }
}