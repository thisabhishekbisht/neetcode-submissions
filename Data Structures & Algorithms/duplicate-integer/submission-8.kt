class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if(nums.size<=1) return false
        var map: HashSet<Int> =HashSet()
        val length = nums.size
        for(value in nums){
            if(map.contains(value)){
                return true
            }
            else{
                map.add(value)
            }
        }
return false
    }
}
