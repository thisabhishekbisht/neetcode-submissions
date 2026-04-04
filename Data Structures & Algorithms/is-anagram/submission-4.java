class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
          int len2 = t.length();
       if(len1!=len2) return false;
        boolean isAnagram=false;
        HashMap<Character,Integer> map1 = addData(s);
        HashMap<Character,Integer> map2 = addData(t);
        if(map1.equals(map2)){
            isAnagram = true;

        }
        else
        {
            isAnagram= false;
        }

  return isAnagram;
}
    public HashMap<Character,Integer> addData(String s){

    HashMap<Character,Integer> map = new HashMap<>();
        for(int i= 0;i<s.length();i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                int value = map.get(c);
                map.put(c,value+1);
            }
            else
            {
                map.put(c,1);
            }
            
        }
        return map;
}
}
