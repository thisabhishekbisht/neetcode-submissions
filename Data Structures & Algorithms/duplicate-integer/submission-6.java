class Solution {
    public boolean hasDuplicate(int[] nums) {
      if(nums.length<=1) return false;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i =0;i<nums.length;i++){
        int value = nums[i];
        if(map.containsKey(value)){
          
          return true;
        }
        else
        {
          map.put(value,1);
        }
      }
    
    return false;
}
}