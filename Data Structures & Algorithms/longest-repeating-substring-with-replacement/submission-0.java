class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        if(s==null || len==0) return 0;

        int[] arr = new int[26];
        int left =0;
        int maxFreq =0;
        int result =0;

        for(int right =0; right <len;right++){
            int idx = s.charAt(right)- 'A';
            arr[idx]++;
            if(arr[idx]>maxFreq) maxFreq = arr[idx];

            while(right -left +1 -maxFreq>k){
            arr[s.charAt(left)-'A']--;
            left ++;
            }
            result = Math.max(result,right -left+1);

        }
return result;
    }
}
