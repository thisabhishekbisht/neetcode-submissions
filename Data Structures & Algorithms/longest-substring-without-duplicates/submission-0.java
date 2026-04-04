class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len==0 || s==null) return 0;
int maxLen=0;

HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int start = 0;

        for(int i =0;i<len;i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch) && map.get(ch)>=start){
                start = map.get(ch)+1;

            }
            map.put(ch,i);
            maxLen = Math.max(maxLen,i-start+1);

        }

        return maxLen;
    }
}
