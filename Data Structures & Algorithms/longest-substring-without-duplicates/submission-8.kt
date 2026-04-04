class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s==null || s.length==0) return 0

        var max = 0
        var left =0

        val set = HashSet<Char>()
        for(right in s.indices){
          var ch = s.get(right)
          while(set.contains(ch)){
            set.remove(s.get(left))
            left++
          }
  set.add(ch)
  max = Math.max(max,right-left+1)
        }

return max
}
}
