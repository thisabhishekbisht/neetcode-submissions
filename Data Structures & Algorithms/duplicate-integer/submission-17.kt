class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if(nums.size<=1) return false
        val set = HashSet<Int>()
        for(i in nums){
            if(set.contains(i)){
                return true
            }
            else{
                set.add(i)
            }
        }
        return false
    }
}
