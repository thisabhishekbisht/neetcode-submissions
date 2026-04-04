class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
            if(s1.length>s2.length) return false
           
        val pCount = IntArray(26)

        val windowCount = IntArray(26)

        for(c in s1){
            pCount[c- 'a']++
        }

        for(i in s2.indices){
            windowCount[s2[i] - 'a']++

            if(i>= s1.length){
                windowCount[s2[i-s1.length] - 'a']--

            }
            if(pCount.contentEquals(windowCount)){
                return true
            }

        }


        return false

    }
}
