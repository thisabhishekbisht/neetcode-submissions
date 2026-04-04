class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len==0 || s==null) return 0;
        int left =0;
        int max=0;

        Set<Character> set = new HashSet<>();

        for(int right =0;right<len;right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(ch);
            max=Math.max(max,right-left+1);


        }
        
        return max;
    }
}
