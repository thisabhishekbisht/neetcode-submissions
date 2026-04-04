class Solution {

    fun encode(strs: List<String>): String {
      var builder:StringBuilder = StringBuilder()
      var code ="#"
      for(i in 0..strs.size-1){
        val str = strs[i]
        val len = str.length
        builder.append(len.toString()+code.toString()+str)

      }

return builder.toString()
    }

    fun decode(str: String): List<String> {

      val list = mutableListOf<String>()

      var i =0
      while(i<str.length){
        var j=i
          // Find the delimiter '#'
        while(str.get(j)!='#'){
          j++

        }
         // Extract length
        val length: Int = str.substring(i,j).toInt()
        j++

        // Extract the actual string
        val word:String = str.substring(j,j+length)
        list.add(word)

        
        i=j+length
      }

    return list
    }
}
