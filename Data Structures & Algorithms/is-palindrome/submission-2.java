class Solution {
    public boolean isPalindrome(String s) {
       String strn = Valid(s);
       int i=0;
       int j = strn.length()-1;
       while(i<=j){
        if(strn.charAt(i)!=strn.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;

    }
    public String Valid(String s){
       StringBuilder str = new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if((ch<='Z' && ch>='A') || (ch<='z' && ch>='a') || (ch>='0' && ch<='9')){
            str.append(Character.toLowerCase(ch));
        }
       }
       return str.toString();
    }
}
