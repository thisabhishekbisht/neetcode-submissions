class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

     if(nums.size<=1 || nums==null) return intArrayOf()
    for(i in nums.indices){
      for(j in i+1 until nums.size){
        val sum = nums[i] + nums[j]

        if(sum == target){
          return intArrayOf(Math.min(i,j), Math.max(i,j))
        }
      }
    }
return intArrayOf()
    }

}