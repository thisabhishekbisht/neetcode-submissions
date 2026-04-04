class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean contains = false;
        int len = nums.length;
        if(len==0 || len==1) return false;
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i =0; i<len ;i++){
    int value = nums[i];
        if(map.containsKey(value)){
        contains = true;
        }
        else
        {
            map.put(value,1);
        }
 }
        
        return contains;
    }
}