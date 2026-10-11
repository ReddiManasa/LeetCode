class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalindrome=false;
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s)){
            isPalindrome=true;
        }
        else{
            isPalindrome=false;
        }
    return isPalindrome;
    }
}