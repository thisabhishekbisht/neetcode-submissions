class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
      if(numbers.size<=1 || numbers== null) return intArrayOf()
      
      var left =0
      var right = numbers.size-1
      while(left<right){
        val sum = numbers[left] + numbers[right]
        if(sum==target){
          return intArrayOf(left+1,right+1)
          break
        }
        else if(sum>target){
            right--
        }
        else
        {
          left++
        }

      }
return  intArrayOf()
}
}
