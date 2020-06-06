class Solution {
    public void reverseString(char[] s) {
        int last=s.length;
        int first=0;
        while(first<last){
            char t=s[first];
            s[first]=s[last-1];
            s[last-1]=t;
            first++;
            last--;
        }      
    }
}
