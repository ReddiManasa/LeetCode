class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int rev=0;
        int temp=x;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
        }
    }
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
    }
}