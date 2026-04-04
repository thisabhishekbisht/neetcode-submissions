class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

      if(nums.size<=1 || nums==null) return intArrayOf()

        val twoDArray = nums.mapIndexed { index, value ->
        arrayOf(value, index)
    }.sortedBy { it[0] }

    // You can then print the resulting array of arrays
    twoDArray.forEach { print("[${it[0]}, ${it[1]}] ") }
      var left =0;
      var right = nums.size-1

      while(left<right){
        val sum = twoDArray[left][0] + twoDArray[right][0]

        if(sum == target){
            val index1 = twoDArray[left][1]
            val index2 = twoDArray[right][1]

            return intArrayOf(Math.min(index1,index2),Math.max(index1,index2))
           
        }
        else if(sum > target){

                right --
        }
        else
        {
            left++
        }
      }


return intArrayOf()
    }
}