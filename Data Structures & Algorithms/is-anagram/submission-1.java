class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

if(len1!=len2){
return false;
}
        char array1[]  = s.toCharArray();
        char array2[]  = t.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

return Arrays.equals(array1,array2);
    }
}
