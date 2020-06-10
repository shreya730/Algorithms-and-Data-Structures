class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
       int s_index=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(s_index))
                s_index++;
            if(s_index==s.length())
                return true;
        }
        return s_index==s.length();
        
    }
}