class Solution {
    public int reverseBits(int n) {
        String binary=Integer.toBinaryString(n);
        String rev="";
        while(binary.length() < 32) {
            binary = "0" + binary;
        }
        for(int i=binary.length()-1;i>=0;i--){
            char c=binary.charAt(i);
            rev=rev+c;
        }
        int num = Integer.parseInt(rev, 2);
        return num;
    }
}