class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') l=0;
            else l++;
        }
        return l;
    }
}
