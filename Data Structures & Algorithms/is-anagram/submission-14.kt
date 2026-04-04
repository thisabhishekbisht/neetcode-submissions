class Solution {
    fun isAnagram(s: String, t: String): Boolean {
      if(s==null || t==null) return false

      val map = HashMap<Char,Int>()

      val map1 = HashMap<Char,Int>()

        for(i in s){
            map[i]=map.getOrDefault(i,0)+1
        }

        for(i in t){
            map1[i] = map1.getOrDefault(i,0)+1
        }

      return map1==map
}
}