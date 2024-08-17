class Solution {
    public String shortestPalindrome(String s) {
       StringBuilder s1=new StringBuilder(s);
       s1.reverse();
       for(int i=0;i<s.length();i++){
        if(s.startsWith(s1.substring(i))){
            return s1.substring(0,i)+s;
        }
       }
       return "";
    }
}