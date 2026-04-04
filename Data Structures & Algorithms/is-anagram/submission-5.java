class Solution {
    public boolean isAnagram(String s, String t) {
          int len1 = s.length();
          int len2 = t.length();
       if(len1!=len2) return false;

       HashMap<Character,Integer> map1 =    addData(s);
       HashMap<Character,Integer> map2 =   addData(t);
    // add daat in first map
 
  
    if(map1.equals(map2)){
        return true;
    }
    else
    {
       return false;
    }
        

    }

        public HashMap<Character,Integer> addData(String s){
             HashMap<Character,Integer> map = new HashMap<>();
                for(int i =0;i<s.length();i++){
                      char ch = s.charAt(i);
                      if(map.containsKey(ch)){
                        int value = map.get(ch);
                          map.put(ch,value+1);

                      }
                      else
                      {
                            map.put(ch,1);
                      }
                }
           return map;
        }
}
