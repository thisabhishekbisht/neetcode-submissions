class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        // main list that get all sub sets

        val result = mutableListOf<List<Int>>()

        // all subset solution sould contains empty subset
        result.add(emptyList())


   for(num in nums){
        val subsets = mutableListOf<List<Int>>()

     for(value in result){
            val subset = value.toMutableList()
            subset.add(num)
            subsets.add(subset)
     }

     result.addAll(subsets)

        }
        return result
    }
}
