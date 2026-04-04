class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        if(nums.size<=1) return false

        val map = HashMap<Int,Int>()

        for(i in nums){
            if(map.containsKey(i)){
                return true
            }
            map.put(i,1)
        }
        return false
   }
}
