class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

      if(nums.size<=1 || nums==null) return intArrayOf()
 
      val map = HashMap<Int,Int>()

      for(i in nums.indices){
        val complement = target-nums[i]

        if(map.containsKey(complement)){
          return intArrayOf(map[complement]!!,i)
        }
        map.put(nums[i],i)
      }
        return intArrayOf()
    }
}