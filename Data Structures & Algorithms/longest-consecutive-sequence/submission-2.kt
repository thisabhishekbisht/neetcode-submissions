class Solution {
    fun longestConsecutive(nums: IntArray): Int {
      if(nums.size==0 && nums==null) return 0
      
      val set = HashSet<Int>()

      for(i in nums){
        set.add(i)
      }

      var best = 0

      for(j in nums){
        if(!set.contains(j-1)){
        var cur =j
        var size=1
        while(set.contains(cur+1)){
          cur++
          size++
        }

        best = Math.max(best,size)
      }
    }
    return best
}
}
