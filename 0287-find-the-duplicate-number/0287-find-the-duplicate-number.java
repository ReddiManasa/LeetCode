class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>m=new HashMap<Integer,Integer>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return 0;
    }
}