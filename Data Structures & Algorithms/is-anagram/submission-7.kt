class Solution {
    fun isAnagram(s: String, t: String): Boolean {

    // we have 2 string s o we will add these data from both string in diff hashmaps
    val map = HashMap<Char,Int>()
    for(i in s){
      map[i]=map.getOrDefault(i,0)+1
    }

    for(j in t){
      val value = map.get(j) ?: return false
      if(value==1){
      map.remove(j)

      }
      else{
        map[j] = value -1
      }
    }
return map.isEmpty()
    }
}
