class Solution {
    public boolean isAnagram(String s, String t) {
        
    boolean isTrue = false;    
    HashMap<Character,Integer> map1 =  addDataToHashMap(s);
       HashMap<Character,Integer> map2 = addDataToHashMap(t);
// if length of the string are same then only it can proceed ahead
if(s.length()==t.length()){
    // now check for exact same values 
    if(map1.equals(map2)){
        isTrue =true;
    }else
    {
         isTrue =false;
    }
}
// else we can start checking for other conditions
else
{
   isTrue = false;
}
return isTrue;
    }

    public HashMap<Character,Integer> addDataToHashMap(String str){
HashMap<Character, Integer> hashMap = new HashMap<>();
for(int i=0;i<str.length();i++){

if(hashMap.containsKey(str.charAt(i))){
    int value = hashMap.get(str.charAt(i));
 hashMap.put(str.charAt(i),value+1);
}
else{
    hashMap.put(str.charAt(i),1);
}
}
System.out.println(hashMap);
return hashMap;
    }
}
