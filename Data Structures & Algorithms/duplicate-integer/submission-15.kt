class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if(nums.size<2) return false
        val set = HashSet<Int>()

        for(i in nums){
            if(set.contains(i)){
                return true
            }
            set.add(i)
        }

        return false
   }
}
