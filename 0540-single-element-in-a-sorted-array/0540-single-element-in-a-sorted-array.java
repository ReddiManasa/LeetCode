class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xornums=0;
        for(int i=0;i<nums.length;i++){
            xornums=xornums^nums[i];
        }
        return xornums;
    }
}