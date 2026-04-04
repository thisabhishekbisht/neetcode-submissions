class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

      if(nums.size<=1 || nums==null) return intArrayOf()

      val Array2D = nums.mapIndexed { index, value -> 
      arrayOf(value, index)

      }.sortedBy { it[0] }

      var left =0
      var right = nums.size-1

      while(left<right){
        val sum = Array2D [left][0] + Array2D [right][0]
        
        if(sum==target){
            val index1 = Array2D[left][1]
            val index2 = Array2D[right][1]

            return intArrayOf(Math.min(index1,index2),Math.max(index1,index2))

        }
        else if(sum>target)
        {            right--

        }
        else
        {
            left++
        }
      }

     

        return intArrayOf()
    }
}