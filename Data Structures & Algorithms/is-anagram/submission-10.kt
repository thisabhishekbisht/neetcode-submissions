class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map1 = HashMap<Char,Int>()
        val map2 = HashMap<Char,Int>()


        for(i in s){
            map1[i]=map1.getOrDefault(i,0)+1
        }

        for(i in t){
            map2[i]=map2.getOrDefault(i,0)+1

        }

        return map1==map2
    }
}
