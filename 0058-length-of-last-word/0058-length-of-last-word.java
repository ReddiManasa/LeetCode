class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                String x=a[a.length-1];
                count=x.length();
            } 
        }
        return count;
    }
}