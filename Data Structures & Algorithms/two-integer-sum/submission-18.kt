class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

      if(nums.size<=1 || nums==null) return intArrayOf()

      val array2D = nums.mapIndexed{index,value-> arrayOf(value,index)}.sortedBy{it[0]}

      var left =0
      var right = nums.size-1

      while(left<right){
        val sum = array2D[left][0] + array2D[right][0]
        if( sum== target){
          return intArrayOf(Math.min(array2D[left][1],array2D[right][1]),Math.max(array2D[left][1],array2D[right][1]))
        }
        else if(sum > target){
          right--

        }
        else
        {
          left++
        }
      }




return intArrayOf()
    }

}