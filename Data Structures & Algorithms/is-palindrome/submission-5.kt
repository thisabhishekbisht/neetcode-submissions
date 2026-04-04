class Solution {
    fun isPalindrome(a: String): Boolean {
    if(a==null || a.length==0) return false

     val regex = "[^a-zA-Z0-9]".toRegex()
     val s =a.replace(regex,"").lowercase()
    val len = s.length
    var left =0

var right = len -1

while(left<right){
    if(s[left]!= s[right]){
        return false
    }
    left++
    right--
}

return true

    }   
}
