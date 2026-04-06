class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

      if(nums.size<=1 || nums==null) return intArrayOf()
      for(i in nums.indices){
        for(j in i+1 until nums.size){
     if(nums[i] + nums[j]==target){
          return intArrayOf(i,j)
          }
        }
      }
        return intArrayOf()
    }
}