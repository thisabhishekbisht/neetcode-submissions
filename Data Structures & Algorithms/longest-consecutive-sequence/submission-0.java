class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0 && nums== null) return 0;

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
                set.add(num);
        }


        int best= 0;

        for(int i : set){
            if(!set.contains(i-1)){
                
                int cur = i;
                int len = 1;

                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }

                best =  Math.max(best,len);
            }
        }
        return best;
    }
}
