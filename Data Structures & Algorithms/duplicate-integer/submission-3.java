class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean contains = false;
        int len = nums.length;
        int count =0;
        if(len==0 || len==1) return false;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<len;i++){
            int value = nums[i];
            //check if map contains duplicate
            if(map.containsKey(value)){
                return true;

            }
            else
            {
                map.put(value,count+1);
            }
        }
    
    return contains;
    }
}