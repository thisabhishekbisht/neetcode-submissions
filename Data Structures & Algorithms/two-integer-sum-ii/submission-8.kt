class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
      if(numbers.size<=1 || numbers== null) return intArrayOf()

for(i in 0..numbers.size-1){
  for(j in i+1..numbers.size-1){
if(numbers[i] + numbers[j] == target){
return intArrayOf(i+1,j+1)
}
  }
}
        return intArrayOf()
    }
  
}
