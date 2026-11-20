class Solution {
    public int missingNumber(int[] nums) {
        int xorall=0;
        int xornums=0;
        for(int i=0;i<nums.length;i++){
            xorall=xorall^(i+1);
            xornums=xornums^nums[i];
        }
        return xorall^xornums;
    }
}